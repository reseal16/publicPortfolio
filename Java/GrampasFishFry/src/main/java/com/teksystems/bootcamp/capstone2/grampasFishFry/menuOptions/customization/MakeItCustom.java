package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization;

import java.util.HashMap;
import java.util.List;

public class MakeItCustom {
    private static HashMap breading = new HashMap<List<Integer>, String>();
    private static HashMap fish = new HashMap<List<Integer>, String>();
    private static HashMap toppings = new HashMap<List<Integer>, String>();
    private static HashMap drinks = new HashMap<List<Integer>, String>();
    private static HashMap juice = new HashMap<List<Integer>, String>();
    private static HashMap soda = new HashMap<List<Integer>, String>();
    private static HashMap cut = new HashMap<List<Integer>, String>();
    private static HashMap side = new HashMap<List<Integer>, String>();
    private static HashMap size = new HashMap<List<Integer>, String>();

    public static String setFish(int i){
        fish.put(1, "Catfish");
        fish.put(2, "Walleye");
        fish.put(3, "Cod");
        fish.put(4, "Frog Legs");

        return fish.get(i).toString();
    }

    public static HashMap getFish(){
        fish.put(1, "Catfish");
        fish.put(2, "Walleye");
        fish.put(3, "Cod");
        fish.put(4, "Frog Legs");

        return fish;
    }

    public static String setCut(int i){
        cut.put(1, "Nuggets");
        cut.put(2, "Fillet");

        return cut.get(i).toString();
    }

    public static HashMap getCut(){
        cut.put(1, "Nuggets");
        cut.put(2, "Fillet");

        return cut;
    }

    public static String setBreading(int i){
        breading.put(1, "Grampa's Special");
        breading.put(2, "Beer Batter");
        breading.put(3, "Cajun");

        return breading.get(i).toString();
    }

    public static HashMap getBreading(){
        breading.put(1, "Grampa's Special");
        breading.put(2, "Beer Batter");
        breading.put(3, "Cajun");

        return breading;
    }

//    public static String setToppings(int i){
//        toppings.put(1, "Lettuce");
//        toppings.put(2, "Tomato");
//        toppings.put(3, "Mayo");
//        toppings.put(4, "Cheese");
//
//        return toppings.get(i).toString();
//    }
//
//    public static HashMap getToppings(){
//        toppings.put(1, "Lettuce");
//        toppings.put(2, "Tomato");
//        toppings.put(3, "Mayo");
//        toppings.put(4, "Cheese");
//
//        return toppings;
//    }

    public static String setSide(int i){
        side.put(1, "Steak Fries");
        side.put(2, "Gramma's Tater Salad");
        side.put(3, "Baked Beans");
        side.put(4, "Cottage Cheese");

        return side.get(i).toString();
    }

    public static HashMap getSide(){
        side.put(1, "Steak Fries");
        side.put(2, "Gramma's Tater Salad");
        side.put(3, "Baked Beans");
        side.put(4, "Cottage Cheese");

        return side;
    }

    public static String setDrink(int i){
        drinks.put(1, "Ice Tea");
        drinks.put(2, "Coke");
        drinks.put(3, "Juice");
        drinks.put(4, "Milk");

        return drinks.get(i).toString();
    }

    public static HashMap getDrink(){
        drinks.put(1, "Ice Tea");
        drinks.put(2, "Coke");
        drinks.put(3, "Juice");
        drinks.put(4, "Milk");

        return drinks;
    }

    public static String setJuice(int i){
        juice.put(1, "Apple Juice");
        juice.put(2, "Orange Juice");
        juice.put(3, "Grapefruit Juice");
        juice.put(4, "Grape Juice");

        return juice.get(i).toString();
    }

    public static HashMap getJuice() {
        return juice;
    }

    public static String setSoda(int i){
        soda.put(1, "Coca-Cola");
        soda.put(2, "Sprite");
        soda.put(3, "Root Beer");
        soda.put(4, "Mello Yello");

        return soda.get(i).toString();
    }

    public static HashMap getSoda(){
        soda.put(1, "Coca-Cola");
        soda.put(2, "Sprite");
        soda.put(3, "Root Beer");
        soda.put(4, "Mello Yello");

        return soda;
    }

    public static String setSize(int i){
        size.put(1, "Small");
        size.put(2, "Medium");
        size.put(3, "Large");
        size.put(4, "Country Large");

        return size.get(i).toString();
    }

    public static HashMap getSize(){
        size.put(1, "Small");
        size.put(2, "Medium");
        size.put(3, "Large");
        size.put(4, "Country Large");

        return size;
    }


}
