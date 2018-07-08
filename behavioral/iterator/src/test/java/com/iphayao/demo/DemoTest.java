package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    @Test
    public void testIteratorNameRepository() {
        NameRepository repo = new NameRepository();
        Iterator itr;
        itr = repo.getIterator();
        assertEquals("Robert", itr.next());
        assertTrue(itr.hasNext());

        assertEquals("John", itr.next());
        assertTrue(itr.hasNext());

        assertEquals("Julie", itr.next());
        assertTrue(itr.hasNext());

        assertEquals("Lora", itr.next());
        assertFalse(itr.hasNext());

    }

}