package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.assertEquals;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

    @Before
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testVisitorComputerPartDisplayVisitor() {
        ComputerPart computerPart = new Computer();
        computerPart.accept(new ComputerPartDisplayVisitor());

        String expect = "";
        expect += "Displaying Mouse." + lineSeparator();
        expect += "Displaying Keyboard." + lineSeparator();
        expect += "Displaying Monitor." + lineSeparator();
        expect += "Displaying Computer." + lineSeparator();

        assertEquals(expect, outputStream.toString());
    }

}