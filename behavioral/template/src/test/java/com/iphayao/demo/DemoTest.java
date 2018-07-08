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
    public void testTemplateFootballPlay() {
        Game game = new Football();
        game.play();

        String expected = "";
        expected += "Football Game Finish!" + lineSeparator();
        expected += "Football Game Initialized! Start playing." + lineSeparator();
        expected += "Football Game Started. Enjoy the game!" + lineSeparator();

        assertEquals(expected, outputStream.toString());

    }

    @Test
    public void testTemplateBasketballPlay() {
        Game game = new Basketball();
        game.play();

        String expected = "";
        expected += "Basketball Game Finish!" + lineSeparator();
        expected += "Basketball Game Initialized! Start playing." + lineSeparator();
        expected += "Basketball Game Started. Enjoy the game!" + lineSeparator();

        assertEquals(expected, outputStream.toString());

    }
}