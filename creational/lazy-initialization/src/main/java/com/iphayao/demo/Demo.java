package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        Fruit.getFruitByTypeName(FruitType.banana);
        Fruit.showAll();

        Fruit.getFruitByTypeName(FruitType.apple);
        Fruit.showAll();

        Fruit.getFruitByTypeName(FruitType.none);
        Fruit.showAll();
    }
}
