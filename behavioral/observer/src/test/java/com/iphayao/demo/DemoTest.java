package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {
    public final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public Subject subject = new Subject();

    @Before
    public void setup() {
        System.setOut(new PrintStream(outputStream));
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
    }

    @Test
    public void testObserverFirstStateChange15() {
        String expected = "";
        expected += "Hex String: f" + lineSeparator();
        expected += "Octal String: 17" + lineSeparator();
        expected += "Binary String 1111" + lineSeparator();

        subject.setState(15);
        assertEquals(expected, outputStream.toString());
    }

    @Test
    public void testObserverFirstStateChange10() {
        String expected = "";
        expected += "Hex String: a" + lineSeparator();
        expected += "Octal String: 12" + lineSeparator();
        expected += "Binary String 1010" + lineSeparator();

        subject.setState(10);
        assertEquals(expected, outputStream.toString());
    }

}