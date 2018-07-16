package com.iphayao.demo;

import java.util.HashMap;
import java.util.Map;

public class Fruit {
    private static Map<FruitType, Fruit> types = new HashMap<>();

    private Fruit(FruitType fruitType) {

    }

    public static Fruit getFruitByTypeName(FruitType type) {
        Fruit fruit;
        if(!types.containsKey(type)) {
            // Lazy Initialization
            fruit = new Fruit(type);
            types.put(type, fruit);
        } else {
            // it's available
            fruit = types.get(type);
        }

        return fruit;
    }

    public static Map getTypes() {
        return types;
    }

    public static void showAll() {
        if(types.size() > 0) {
            System.out.println("Number of instance made = " + types.size());
            for(Map.Entry<FruitType, Fruit> e : types.entrySet()) {
                String fruit = e.getKey().toString();
                fruit = Character.toUpperCase(fruit.charAt(0)) + fruit.substring(1);
                System.out.println(fruit);
            }
            System.out.println();
        }
    }

}
