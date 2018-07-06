package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testRedCircleGetDrawingCircleRed() {
        Shape s = new Circle(new RedCircle(), 100, 100, 10);
        assertEquals("Drawing Circle [ color: red, radius: 10, x: 100, y: 100 ]", s.draw());
    }

    @Test
    public void testGreenCircleGetDrawingCircleGreen() {
        Shape s = new Circle(new GreenCircle(), 100, 100, 10);
        assertEquals("Drawing Circle [ color: green, radius: 10, x: 100, y: 100 ]", s.draw());
    }

}