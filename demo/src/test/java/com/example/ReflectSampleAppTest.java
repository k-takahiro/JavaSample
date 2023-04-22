package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class ReflectSampleAppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testPublicMethod() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 引数なしのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        // 引数なしのコンストラクタを呼び出し
        ReflectSampleApp instance2 = (ReflectSampleApp) clazz.newInstance();
        assertEquals("publicMethod param is none", instance2.publicMethod());
    }

    @Test
    public void testPublicMethod2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 引数ありのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        // 引数なしのコンストラクタを呼び出し
        ReflectSampleApp instance2 = (ReflectSampleApp) clazz.newInstance();
        String pram = "test";
        assertEquals("publicMethod param is " + pram, instance2.publicMethod(pram));
    }

    @Test
    public void testPublicMethod3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        // 引数なしのメソッドをテスト(getMethod()でメソッドを取得)
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        Method method = clazz.getMethod("publicMethod");
        assertEquals("publicMethod param is none", method.invoke(new ReflectSampleApp()));
    }

    @Test
    public void testPublicMethod4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        // 引数ありのメソッドをテスト(getMethod()でメソッドを取得)
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        Method method = clazz.getMethod("publicMethod", String.class);
        String pram = "test";
        assertEquals("publicMethod param is " + pram, method.invoke(new ReflectSampleApp(), pram));
    }

    @Test
    public void testPrivateMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 引数なしのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        Method method = clazz.getDeclaredMethod("privateMethod");
        method.setAccessible(true);
        assertEquals("privateMethod param is none", method.invoke(new ReflectSampleApp()));
    }

    @Test
    public void testPrivateMethod2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 引数ありのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        Method method = clazz.getDeclaredMethod("privateMethod", String.class);
        String pram = "test";
        method.setAccessible(true);
        ReflectSampleApp testTarget = new ReflectSampleApp();
        assertEquals("privateMethod param is " + pram, method.invoke(testTarget, pram));

        // インスタンスメソッドの場合
        // ReflectSampleApp (1)testTarget = new ReflectSampleApp();
        // String returnValue = (1)testTarget.(2)privateMethod((3)pram);
        // リフレクションでは以下で呼び出し
        // (2)method.invoke((1)testTarget, (3)pram);

        // クラスメソッドの場合
        // String returnValue = (1)ReflectSampleApp.(2)privateStaticMethod((3)pram);
        // リフレクションでは以下で呼び出し（クラスメソッドの呼び出しにインスタンスは不要）
        // (2)method.invoke((1)null, (3)pram)
        }

    @Test
    public void testStaticPrivateMethod() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // privateStaticMethodの結果を確認
        // 第一引数：メソッド名（文字列）、第二引数：メソッドの引数（型（String.class等））（なければ指定不要）
        // 第一引数で指定したメソッド（privateStaticMethod）を取得する
        Method method = ReflectSampleApp.class.getDeclaredMethod("privateStaticMethod");
        // プライベートメソッドなのでアクセス許可を与える（パブリックメソッドは不要）
        method.setAccessible(true);
        // 第一引数：インスタンス、第二引数：メソッドの引数（実際の値（"test"等））（なければ指定不要）　
        String returnValue = (String) method.invoke(null);
        // 第一引数：期待値、第二引数：実際の値（テスト対象）
        assertEquals("privateStaticMethod param is none", returnValue);
        // privateメソッドのため呼び出せないが呼び出す場合は以下のイメージ
        // String returnValue = ReflectSampleApp.privateStaticMethod();

    }

    @Test
    public void testPrivateField() {
        // privateFieldの中身を確認
        ReflectSampleApp app = new ReflectSampleApp();
        app.setPrivateField("privateFieldValue");
    }

    @Test
    public void testPrivateStaticField() {
        // privateStaticFieldの中身を確認
        ReflectSampleApp.setPrivateStaticField("privateStaticFieldValue");
    }
}
