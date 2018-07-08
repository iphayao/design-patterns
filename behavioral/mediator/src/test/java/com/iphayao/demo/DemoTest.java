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
    public void setOutputStream() {
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void testMediatorChatRoom() {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        assertTrue(outputStream.toString().endsWith("[Robert] Hi! John!" + lineSeparator()));
        outputStream.reset();

        john.sendMessage("Hello! Robert!");
        assertTrue(outputStream.toString().endsWith("[John] Hello! Robert!" + lineSeparator()));

    }

}