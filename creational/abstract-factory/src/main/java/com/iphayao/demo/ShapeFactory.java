package com.iphayao.demo;

public class ShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String type) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if(type.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        else if(type.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }

        return null;
    }

    Color getColor(String color) {
        return null;
    }
}
