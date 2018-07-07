package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    ShapeMaker shapeMaker = new ShapeMaker();

    @Test
    public void testFacadeShapeMakerCircle() {
        assertEquals("Circle::draw()", shapeMaker.drawCircle());
    }

    @Test
    public void testFacadeShapeMakerRectangle() {
        assertEquals("Rectangle::draw()", shapeMaker.drawRectangle());
    }

    @Test
    public void testFacadeShapeMakerSquare() {
        assertEquals("Square::draw()", shapeMaker.drawSquare());
    }

}