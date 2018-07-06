package com.iphayao.demo;

public class RedCircle implements DrawAPI {
    public String drawCircle(int radius, int x, int y) {
        return "Drawing Circle [ color: red, radius: " + radius + ", x: " + x + ", y: " + y + " ]";
    }
}
