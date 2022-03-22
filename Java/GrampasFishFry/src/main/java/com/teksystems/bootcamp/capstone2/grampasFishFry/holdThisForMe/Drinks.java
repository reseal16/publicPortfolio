//package com.teksystems.bootcamp.capstone2.grampasFishFry.holdThisForMe;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Scanner;
//
//public class Drinks {
//    private static final HashMap drinks = new HashMap<List<Integer>, String>();
//    private boolean hasDrinkNumber = true;
//    public static String setDrink(){
//        drinks.put(1, "Ice Tea");
//        drinks.put(2, "Soda");
//        drinks.put(3, "Juice");
//
//        String selectedDrink;
//        System.out.println("Pick yer drink: ");
//        System.out.println(getDrink());
//
//        Scanner drinkInput = new Scanner(System.in);
//        int drinkNumber = drinkInput.nextInt();
//        if (drinkInput.hasNextInt()) {
//            if (drinkNumber > 3 || drinkNumber < 1) {
//                return "That's not on the menu...";
//            } else if (drinkNumber == 2) {
//                selectedDrink = SelectSoda.setSoda();
//            } else {
//                selectedDrink = drinks.get(drinkNumber).toString();
//            }
//            return selectedDrink;
//        } else {
//            return "That's not on the menu...";
//        }
//    }
//
//    public static HashMap getDrink() {
//        drinks.put(1, "Ice Tea");
//        drinks.put(2, "Soda");
//        drinks.put(3, "Juice");
//
//        return drinks;
//    }
//
//}
