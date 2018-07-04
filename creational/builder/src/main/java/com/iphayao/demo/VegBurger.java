package com.iphayao.demo;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    public float price() {
        return 25.0f;
    }
}
