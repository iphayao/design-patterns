package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        // get an object of 'Circle' and call it draw method.
        Shape s1 = ShapeFactory.getShape("Circle");
        System.out.println(s1.draw());

        // get an object of 'Square' and call it draw method.
        Shape s2 = ShapeFactory.getShape("Square");
        System.out.println(s1.draw());

        // get an object of 'Rectangle' and call it draw method.
        Shape s3 = ShapeFactory.getShape("Rectangle");
        System.out.println(s1.draw());

    }
}
