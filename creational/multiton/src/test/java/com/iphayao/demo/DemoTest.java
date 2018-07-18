package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testMultitonGetInstanceMultitonZero() {
        Multiton m = Multiton.getInstance(MultitonType.ZERO);
        System.out.println(m.toString());

        assertEquals("My number is 0" + lineSeparator(), outputStream.toString());
    }

    @Test
    public void testMultitonGetInstanceMultitonOne() {
        Multiton m = Multiton.getInstance(MultitonType.ONE);
        System.out.println(m.toString());

        assertEquals("My number is 1" + lineSeparator(), outputStream.toString());
    }

    @Test
    public void testMultitonGetInstanceMultitonTwo() {
        Multiton m = Multiton.getInstance(MultitonType.TWO);
        System.out.println(m.toString());

        assertEquals("My number is 2" + lineSeparator(), outputStream.toString());
    }

}