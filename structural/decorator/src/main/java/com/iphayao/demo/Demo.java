package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        System.out.println(circle.draw());

        System.out.println("Circle with red border");
        System.out.println(redCircle.draw());

        System.out.println("Rectangle with red border");
        System.out.println(redRectangle.draw());

    }
}
