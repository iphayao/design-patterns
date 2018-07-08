package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testStrategyOperationAdd() {
        Context context = new Context(new OperationAdd());
        assertEquals(15, context.executeStrategy(10, 5));
    }

    @Test
    public void testStrategyOperationSubstract() {
        Context context = new Context(new OperationSubtract());
        assertEquals(5, context.executeStrategy(10, 5));
    }

    @Test
    public void testStrategyOperationMultiply() {
        Context context = new Context(new OperationMultiply());
        assertEquals(50, context.executeStrategy(10, 5));
    }
}