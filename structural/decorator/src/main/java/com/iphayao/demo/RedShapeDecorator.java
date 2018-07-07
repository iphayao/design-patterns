package com.iphayao.demo;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public String draw() {
        return setRedBorder(decoratedShape);
    }

    private String setRedBorder(Shape decoratedShape) {
        return decoratedShape.draw() + "Border Color: Red";
    }
}
