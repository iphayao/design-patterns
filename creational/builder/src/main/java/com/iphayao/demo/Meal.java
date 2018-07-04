package com.iphayao.demo;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;

        for(Item item : items) {
            cost += item.price();
        }

        return cost;
    }

    public String getItems() {
        String itemsMessage = "";
        for(Item item : items) {
            itemsMessage += "Item : " + item.name();
            itemsMessage += ", Packing : " + item.packing().pack();
            itemsMessage += ", Price : " + item.price();
        }
        return itemsMessage;
    }
}
