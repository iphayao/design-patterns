package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(), 100, 100, 10);
        Shape greenCircle = new Circle(new GreenCircle(), 100, 100, 10);

        System.out.println(redCircle.draw());
        System.out.println(greenCircle.draw());
    }
}
