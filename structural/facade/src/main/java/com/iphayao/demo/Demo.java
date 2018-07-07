package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();

        System.out.println(shapeFacade.drawCircle());
        System.out.println(shapeFacade.drawRectangle());
        System.out.println(shapeFacade.drawSquare());
    }
}
