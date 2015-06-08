package org.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    private Hello hello;

    @Before
    public void setUp() {
        hello = new Hello();
    }

    @Test
    public void testHello() {
        hello.helloMessage();
        String message = hello.helloMessage();
        System.out.println(message);
        assertEquals("hello2", message);
    }

    @Test
    public void testHello2() {
        String message = hello.helloMessage();
        System.out.println(message);
        assertEquals("hello1", message);
    }
}
