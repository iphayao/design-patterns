package com.iphayao.demo;

import java.util.HashMap;
import java.util.Map;

public class Multiton {
    private static Map<MultitonType, Multiton> instances = new HashMap<>();
    private int number;

    private Multiton(int number) {
        this.number = number;
    }

    public static Multiton getInstance(MultitonType type) {
        if(!instances.containsKey(type)) {
            instances.put(type, new Multiton(type.ordinal()));
        }

        return instances.get(type);
    }


    @Override
    public String toString() {
        return "My number is " + number;
    }
}
