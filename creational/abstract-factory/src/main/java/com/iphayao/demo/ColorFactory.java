package com.iphayao.demo;

public class ColorFactory extends AbstractFactory {
    @Override
    Color getColor(String type) {
        if(type == null) {
            return null;
        }

        if(type.equalsIgnoreCase("RED")) {
            return new Red();
        }
        else if(type.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        else if(type.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }

        return null;
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
