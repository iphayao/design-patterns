package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DemoTest {
    @Test
    public void testShapeFactoryGetShapeWithTypeRectangle() {
        Shape shape = ShapeFactory.getShape("Rectangle");
        assertEquals("Invoked Rectangle::draw() method", shape.draw());
    }

    @Test
    public void testShapeFactoryGetShapeWithTypeCircle() {
        Shape shape = ShapeFactory.getShape("Circle");
        assertEquals("Invoked Circle::draw() method", shape.draw());
    }

    @Test
    public void testShapeFactoryGetShapeWithTypeSquare() {
        Shape shape = ShapeFactory.getShape("Square");
        assertEquals("Invoked Square::draw() method", shape.draw());
    }

    @Test
    public void testShapeFactoryGetShapeWithTypeNull() {
        Shape shape = ShapeFactory.getShape(null);
        assertNull(shape);
    }

    @Test
    public void testShapeFactoryGetShapeWithTypeEmpty() {
        Shape shape = ShapeFactory.getShape("");
        assertNull(shape);
    }

}