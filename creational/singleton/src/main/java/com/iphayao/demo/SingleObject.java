package com.iphayao.demo;

public class SingleObject {
    // create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    // make the constructor private so that this class cannot be implemented
    private SingleObject() {}

    // get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public String showMessage() {
        return "Hello, World";
    }
}
