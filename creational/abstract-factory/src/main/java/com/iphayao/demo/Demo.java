package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        // get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");

        // get an object of 'Circle' and call it draw method.
        Shape s1 = shapeFactory.getShape("Circle");
        System.out.println(s1.draw());

        // get an object of 'Square' and call it draw method.
        Shape s2 = shapeFactory.getShape("Rectangle");
        System.out.println(s2.draw());

        // get an object of 'Rectangle' and call it draw method.
        Shape s3 = shapeFactory.getShape("Square");
        System.out.println(s3.draw());

        // get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");

        // get an object of "Red" and call it fill method.
        Color c1 = colorFactory.getColor("Red");
        System.out.println(c1.fill());

        // get an object of "Green" and call it fill method.
        Color c2 = colorFactory.getColor("Green");
        System.out.println(c2.fill());

        // get an object of "Blue" and call it fill method.
        Color c3 = colorFactory.getColor("Blue");
        System.out.println(c3.fill());

    }
}
