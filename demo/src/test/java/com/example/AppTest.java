package com.example;

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
            instance2.publicMethod();
    }

    @Test
    public void testPublicMethod2() {
        // 引数ありのメソッドをテスト
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
