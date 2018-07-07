package com.iphayao.demo;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public String drawCircle() {
        return circle.draw();
    }

    public String drawRectangle() {
        return rectangle.draw();
    }

    public String drawSquare() {
        return square.draw();
    }
}
