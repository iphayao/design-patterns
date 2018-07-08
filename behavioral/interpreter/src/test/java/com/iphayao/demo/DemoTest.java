package com.iphayao.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomenExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    @Test
    public void testInterpreterGetMaleExpressionTrue() {
        Expression exp = getMaleExpression();
        assertTrue(exp.interpret("John"));
    }

    @Test
    public void testInterpreterGetMaleExpressionFalse() {
        Expression exp = getMaleExpression();
        assertFalse(exp.interpret("Jan"));
    }

    @Test
    public void testInterpreterGetMarriedExpressionTrue() {
        Expression exp = getMarriedWomenExpression();
        assertTrue(exp.interpret("Married Julie"));
    }

    @Test
    public void testInterpreterGetMarriedExpressionFalse() {
        Expression exp = getMarriedWomenExpression();
        assertFalse(exp.interpret("Married Jan"));
    }
}