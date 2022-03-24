package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.Main;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.CustomizationOptions;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Side;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.ArrayList;
import java.util.Scanner;

public class AddSideUI {
    private static ArrayList<String> newSide = new ArrayList<>();
    public static void createNewSideItem() {
        Scanner input = new Scanner(System.in);
        Side yourSide = new Side();
        int i;

        System.out.println("Whatcha want with it?");
        System.out.println(CustomizationOptions.getSide());
        i = input.nextInt();
        yourSide.setSide(CustomizationOptions.setSide(i));

        System.out.println("How much?");
        System.out.println(CustomizationOptions.getSize());
        i =input.nextInt();

        yourSide.setSize(CustomizationOptions.setSize(i));

        newSide.add(yourSide.getSize()+" "+yourSide.getSide());

        Orders.addToOrder(String.valueOf(newSide));
        System.out.println(newSide + " added to order");

        newSide.clear();
        ProgramStart.programStart();

    }
}
