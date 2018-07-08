package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    Context context = new Context();

    @Test
    public void testStateStartState() {
        StartState startState = new StartState();
        startState.doAction(context);
        assertEquals("Start State", context.getState().toString());
    }

    @Test
    public void testStateStopState() {
        StopState stopState = new StopState();
        stopState.doAction(context);
        assertEquals("Stop State", context.getState().toString());
    }

}