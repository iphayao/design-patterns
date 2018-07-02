package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testAbstractShapeFactoryGetShapeWithTypeRectangle() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("Rectangle");
        assertEquals("Invoked Rectangle::draw() method", shape.draw());
    }

    @Test
    public void testAbstractShapeFactoryGetShapeWithTypeCircle() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("Circle");
        assertEquals("Invoked Circle::draw() method", shape.draw());
    }

    @Test
    public void testAbstractShapeFactoryGetShapeWithTypeSquare() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("Square");
        assertEquals("Invoked Square::draw() method", shape.draw());
    }

    @Test
    public void testAbstractShapeFactoryGetShapeWithTypeNull() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape(null);
        assertNull(shape);
    }

    @Test
    public void testAbstractShapeFactoryGetShapeWithTypeEmpty() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Shape");
        Shape shape = abstractFactory.getShape("");
        assertNull(shape);
    }

    @Test
    public void testAbstractColorFactoryGetShapeWithTypeRed() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor("Red");
        assertEquals("Invoked Red::fill() method", color.fill());
    }

    @Test
    public void testAbstractColorFactoryGetShapeWithTypeGreen() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor("Green");
        assertEquals("Invoked Green::fill() method", color.fill());
    }

    @Test
    public void testAbstractColorFactoryGetShapeWithTypeBlue() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor("Blue");
        assertEquals("Invoked Blue::fill() method", color.fill());
    }

    @Test
    public void testAbstractColorFactoryGetShapeWithTypeNull() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor(null);
        assertNull(color);
    }

    @Test
    public void testAbstractColorFactoryGetShapeWithTypeEmpty() {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("Color");
        Color color = abstractFactory.getColor("");
        assertNull(color);
    }
}