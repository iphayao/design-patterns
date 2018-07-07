package com.iphayao.demo;

public class ShapeFacade {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeFacade() {
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
