package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testDecoratorCircleWithoutRedDecoratorReturnNormalBorder() {
        Shape circle = new Circle();
        assertEquals("Shape: Circle", circle.draw());
    }

    @Test
    public void testDecoratorCircleWithRedDecoratorReturnRectangleRedBorder() {
        Shape circle = new RedShapeDecorator(new Circle());
        assertEquals("Shape: CircleBorder Color: Red", circle.draw());
    }

    @Test
    public void testDecoratorRegtangleWithRedDecoratorReturnRactangleRedBorder() {
        Shape circle = new RedShapeDecorator(new Rectangle());
        assertEquals("Shape: RectangleBorder Color: Red", circle.draw());
    }
}