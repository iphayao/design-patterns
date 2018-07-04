package com.iphayao.demo;

public class Demo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        System.out.println(vegMeal.getItems());
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        System.out.println(nonVegMeal.getItems());
        System.out.println("Total Cost " + nonVegMeal.getCost());
    }
}
