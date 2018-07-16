package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class DemoTest {

    @Test
    public void testLazyInitFruitBanana() {
        Fruit.getFruitByTypeName(FruitType.banana);

        assertEquals(1, Fruit.getTypes().size());
    }

    @Test
    public void testLazyInitFruitApple() {
        Fruit.getFruitByTypeName(FruitType.apple);

        assertEquals(3, Fruit.getTypes().size());
    }

    @Test
    public void testLazyInitFruitNone() {
        Fruit.getFruitByTypeName(FruitType.none);

        assertEquals(2, Fruit.getTypes().size());

    }

}