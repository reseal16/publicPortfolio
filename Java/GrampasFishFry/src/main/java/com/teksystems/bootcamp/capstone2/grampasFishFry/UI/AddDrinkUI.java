package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.Main;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.CustomizationOptions;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Drink;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.ArrayList;
import java.util.Scanner;

public class AddDrinkUI {
    private static ArrayList<String> newDrink = new ArrayList<>();

    public static void createNewDrink() {
        Scanner input = new Scanner(System.in);
        Drink yourDrink = new Drink();
        int i;

        System.out.println("Whatcha wanna drink?");
        System.out.println(CustomizationOptions.getDrink());

        i = input.nextInt();

            switch (i) {
                case 1:
                case 4:
                    yourDrink.setDrink(CustomizationOptions.setDrink(i));
                    break;
                case 2:
                    yourDrink.setDrink(selectSoda());
                    break;
                case 3:
                    yourDrink.setDrink(selectJuice());
                    break;
            }

        System.out.println("How big?");
        System.out.println(CustomizationOptions.getSize());

        newDrink.add(yourDrink.getDrink());

        Orders.addToOrder(String.valueOf(newDrink));
        System.out.println(newDrink + " added to order");

        newDrink.clear();
        ProgramStart.programStart();

    }

    private static String selectJuice() {
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("What kinna juice?");
        System.out.println(CustomizationOptions.getJuice());
        i = input.nextInt();

        return CustomizationOptions.setJuice(i);
    }

    private static String selectSoda(){
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("What kinna juice?");
        System.out.println(CustomizationOptions.getSoda());
        i = input.nextInt();

        return CustomizationOptions.setSoda(i);

    }
}
