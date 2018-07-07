package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        System.out.println(image.display());
        System.out.println("-------------------");
        System.out.println(image.display());
    }
}
