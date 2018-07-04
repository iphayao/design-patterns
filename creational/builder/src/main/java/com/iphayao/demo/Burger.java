package com.iphayao.demo;

public abstract class Burger implements Item {

    public String name() {
        return null;
    }

    public Packing packing() {
        return new Wrapper();
    }

    public abstract float price();
}
