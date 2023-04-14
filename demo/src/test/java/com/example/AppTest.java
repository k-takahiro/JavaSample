package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    public void testPublicMethod3() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 引数なしのメソッドをテスト(getMethod()でメソッドを取得)
        
    }

    @Test
    public void testPublicMethod4() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 引数ありのメソッドをテスト(getMethod()でメソッドを取得)
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
