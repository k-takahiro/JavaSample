package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PostNumberTest {
    static PostNumber target;

    @BeforeClass
    public static void init() {
        target = new PostNumber("979-0201");
    }
    @Test
    public void testGetFormatedValue() {
        assertEquals("979-0201", target.getFormatedValue());
        assertTrue("979-0201".equals(target.getFormatedValue())); // 上を左記で書き換え
        assertNotNull("getFormatedValueが失敗", target.getFormatedValue()); // getFormatedValueがNULLでないことを確認
        // assertNotNullで引数１つのパターンを追加
    }

    @Test
    public void testGetValue() {
        assertEquals("9790201", target.getValue());
        assertFalse(!"9790201".equals(target.getValue()));
        // assertNotNull(); // getFormatedValueがNULLでないことを確認（１つと２つ）
    }

    @Test
    public void testValueOf() {

    }
}
