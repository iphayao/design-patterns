package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testSingleObjectShowHelloWorld() {
        SingleObject obj = SingleObject.getInstance();
        assertEquals("Hello, World", obj.showMessage());
    }

}