package com.iphayao.demo;

public class ShapeFactory {
    // Use static method 'getShape' to get object of type Shape
    public static Shape getShape(String type) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if(type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }

        return null;
    }
}
