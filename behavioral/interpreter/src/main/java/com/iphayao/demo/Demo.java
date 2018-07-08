package com.iphayao.demo;

public class Demo {
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

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWomen = getMarriedWomenExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is married women?" + isMarriedWomen.interpret("Married Julie"));
    }
}
