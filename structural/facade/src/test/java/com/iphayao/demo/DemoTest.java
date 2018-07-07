package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    ShapeFacade shapeFacade = new ShapeFacade();

    @Test
    public void testFacadeShapeFacadeCircle() {
        assertEquals("Circle::draw()", shapeFacade.drawCircle());
    }

    @Test
    public void testFacadeShapeFacadeRectangle() {
        assertEquals("Rectangle::draw()", shapeFacade.drawRectangle());
    }

    @Test
    public void testFacadeShapeFacadeSquare() {
        assertEquals("Square::draw()", shapeFacade.drawSquare());
    }

}