package com.iphayao.demo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {
    private MealBuilder mealBuilder = new MealBuilder();

    @Test
    public void testBuilderVegMealItemsGetMealInformation() {
        Meal meal = mealBuilder.prepareVegMeal();
        assertEquals("Item : Veg Burger, Packing : Wrapper, Price : 25.0Item : Coke, Packing : Bottle, Price : 30.0", meal.getItems());
    }

    @Test
    public void testBuilderVegMealPriceGetMealCost() {
        Meal meal = mealBuilder.prepareVegMeal();
        assertEquals(55.0, meal.getCost(), 0);
    }

    @Test
    public void testBuilderNonVegMealItemsGetMealInformation() {
        Meal meal = mealBuilder.prepareNonVegMeal();
        assertEquals("","Item : Chicken Burger, Packing : Wrapper, Price : 50.5Item : Pepsi, Packing : Bottle, Price : 35.0", meal.getItems());
    }

    @Test
    public void testBuilderNonVegMealPriceGetMealCost() {
        Meal meal = mealBuilder.prepareNonVegMeal();
        assertEquals(85.5, meal.getCost(), 0);
    }

}