package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.Main;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.CustomizationOptions;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Fish;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.ArrayList;
import java.util.Scanner;

public class AddFishUI {
    private static ArrayList<String> newFish = new ArrayList<>();

    public static void createNewFishItem(){
        Scanner input = new Scanner(System.in);
        Fish yourFish = new Fish();
        int i;

        System.out.println("What kind of fish?");
        System.out.println(CustomizationOptions.getFish());

        i = input.nextInt();
        switch(i){
            case 1:
            case 2:
            case 3:
                yourFish.setFish(CustomizationOptions.setFish(i));

                System.out.println("How ya want that cut?");
                System.out.println(CustomizationOptions.getCut());

                i=input.nextInt();
                yourFish.setCut(CustomizationOptions.setCut(i));
                break;
            case 4:
                yourFish.setFish(CustomizationOptions.setFish(i));
                break;
            }


        System.out.println("How ya want it breaded?");
        System.out.println(CustomizationOptions.getBreading());

        i=input.nextInt();
        yourFish.setBreading(CustomizationOptions.setBreading(i));

        newFish.add(yourFish.getFish() + " " + yourFish.getCut() + " " + yourFish.getBreading());

        Orders.addToOrder(String.valueOf(newFish));
        System.out.println(newFish + " added to order");

        newFish.clear();
        ProgramStart.programStart();

    }

}
