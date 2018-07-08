package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    @Before
    public void setup() {
        originator.setState("State#1");
        originator.setState("State#2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State#3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State#4");
    }

    @Test
    public void testMementoCurrentState() {
        assertEquals("State#4", originator.getState());
    }

    @Test
    public void testMementoFirstState() {
        originator.getStateFromMemento(careTaker.get(0));
        assertEquals("State#2", originator.getState());
    }

    @Test
    public void testMementoSecondState() {
        originator.getStateFromMemento(careTaker.get(1));
        assertEquals("State#3", originator.getState());
    }

}