package com.iphayao.demo;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testFlyweightShapeFactoryGetCircle1() {
        Circle circleA = (Circle) ShapeFactory.getCircle("Red");
        assertEquals("Creating circle of color: Red\r\n", outputStream.toString());
    }

    @Test
    public void testFlyweightShapeFactoryGetCircle2() {
        Circle circleB = (Circle)ShapeFactory.getCircle("Red");
        assertEquals("", outputStream.toString());
    }

}