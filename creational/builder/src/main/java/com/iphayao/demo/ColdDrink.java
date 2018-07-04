package com.iphayao.demo;

public abstract class ColdDrink implements Item {
    public String name() {
        return null;
    }

    public Packing packing() {
        return new Bottle();
    }

    public abstract float price();
}
