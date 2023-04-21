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
        Method method = clazz.getMethod("publicMethod", null);
        assertEquals("publicMethod param is none", method.invoke(new ReflectSampleApp(), null));
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
        Method method = clazz.getDeclaredMethod("privateMethod", null);
        method.setAccessible(true);
        assertEquals("privateMethod param is none", method.invoke(new ReflectSampleApp(), null));
    }

    @Test
    public void testPrivateMethod2() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        // 引数ありのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.ReflectSampleApp");
        Method method = clazz.getDeclaredMethod("privateMethod", String.class);
        String pram = "test";
        method.setAccessible(true);
        assertEquals("privateMethod param is " + pram, method.invoke(new ReflectSampleApp(), pram));
    }

    @Test
    public void testStaticPrivateMethod() {
        // privateStaticMethodの結果を確認
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