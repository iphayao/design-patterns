package com.iphayao.demo;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDick(fileName);
    }

    private void loadFromDick(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public String display() {
        return "Displaying " + fileName;
    }
}
