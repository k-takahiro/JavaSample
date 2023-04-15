package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
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
        Class<?> clazz = Class.forName("com.example.App");
        // 引数なしのコンストラクタを呼び出し
        App instance2 = (App) clazz.newInstance();
        assertEquals("publicMethod param is none", instance2.publicMethod());
    }

    @Test
    public void testPublicMethod2() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 引数ありのメソッドをテスト
        Class<?> clazz = Class.forName("com.example.App");
        // 引数なしのコンストラクタを呼び出し
        App instance2 = (App) clazz.newInstance();
        String pram = "test";
        assertEquals("publicMethod param is " + pram, instance2.publicMethod(pram));
    }

    @Test
    public void testPublicMethod3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        // 引数なしのメソッドをテスト(getMethod()でメソッドを取得)
        Class<?> clazz = Class.forName("com.example.App");
        Method method = clazz.getMethod("publicMethod", null);
        assertEquals("publicMethod param is none", method.invoke(new App(), null));
    }

    @Test
    public void testPublicMethod4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        // 引数ありのメソッドをテスト(getMethod()でメソッドを取得)
        Class<?> clazz = Class.forName("com.example.App");
        Method method = clazz.getMethod("publicMethod", String.class);
        String pram = "test";
        assertEquals("publicMethod param is " + pram, method.invoke(new App(), pram));
    }

    @Test
    public void testPrivateMethod() {
        // 引数なしのメソッドをテスト
    }

    @Test
    public void testPrivateMethod2() {
        // 引数ありのメソッドをテスト
    }
}
