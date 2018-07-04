package com.iphayao.demo;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    public float price() {
        return 50.5f;
    }
}
