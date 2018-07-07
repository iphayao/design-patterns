package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    public static Image image = new ProxyImage("test.jpg");

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testProxyImageDisplay1() {
        assertEquals("Displaying test.jpg", image.display());
        assertEquals("Loading test.jpg" + lineSeparator(), outputStream.toString());
    }

    @Test
    public void testProxyImageDisplay2() {
        assertEquals("Displaying test.jpg", image.display());
        assertEquals("", outputStream.toString());

    }

}