package com.example;

import static org.junit.Assert.assertEquals;

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
    }

    @Test
    public void testGetValue() {
        assertEquals("9790201", target.getValue());
    }

    @Test
    public void testValueOf() {

    }
}
