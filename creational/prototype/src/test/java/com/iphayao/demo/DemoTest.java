package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DemoTest {
    @Before
    public void loadCache() {
        ShapeCache.loadCache();
    }

    @Test
    public void testShapeCacheWithIndex1GetShapeTyepCicle() {
        assertEquals("Circle", ShapeCache.getShape("1").getType());
    }

    @Test
    public void testShapeCacheWithIndex2GetShapeTyepRectangle() {
        assertEquals("Rectangle", ShapeCache.getShape("2").getType());
    }

    @Test
    public void testShapeCacheWithIndex3GetShapeTyepSquare() {
        assertEquals("Square", ShapeCache.getShape("3").getType());
    }

}