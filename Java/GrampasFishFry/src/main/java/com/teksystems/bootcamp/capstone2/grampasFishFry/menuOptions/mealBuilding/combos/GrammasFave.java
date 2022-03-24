package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos;

import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.CustomizationOptions;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Drink;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Fish;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Side;
import java.util.ArrayList;
import java.util.Scanner;

public class GrammasFave{
    Scanner input = new Scanner(System.in);

    private Fish grammasFish;
    private Side grammasSide;
    private Drink grammasDrink;
    private ArrayList<String> newComboMeal = new ArrayList();

    public void grammasFish() {
        grammasFish = new Fish();
        System.out.println("What kind of fish?");
        System.out.println(CustomizationOptions.getFish());
        int i = input.nextInt();

        grammasFish.setFish(CustomizationOptions.setFish(i));
        grammasFish.setCut(CustomizationOptions.setCut(2));

        System.out.println("What kind of breading?");
        System.out.println(CustomizationOptions.getBreading());
        i= input.nextInt();
        grammasFish.setBreading(CustomizationOptions.setBreading(i));

        newComboMeal.add(grammasFish.getFish()+" "+grammasFish.getCut()+" "+grammasFish.getBreading());

    }

    public void grammasSide(){
        grammasSide = new Side();
        System.out.println("Whatcha want with it?");
        System.out.println(CustomizationOptions.getSide());
        int i = input.nextInt();
        grammasSide.setSide(CustomizationOptions.setSide(i));

        System.out.println("How much?");
        System.out.println(CustomizationOptions.getSize());
        i = input.nextInt();

        grammasSide.setSize(CustomizationOptions.setSize(i));

        newComboMeal.add(grammasSide.getSize() +" "+ grammasSide.getSide());

    }

    public void grammasDrink(){
        grammasDrink = new Drink();
        System.out.println("Whatcha wanna drink?");
        System.out.println(CustomizationOptions.getDrink());
        int i = input.nextInt();
        grammasDrink.setDrink(CustomizationOptions.setDrink(i));

        System.out.println("How big?");
        System.out.println(CustomizationOptions.getSize());
        i = input.nextInt();

        grammasDrink.setSize(CustomizationOptions.setSize(i));

        newComboMeal.add(grammasDrink.getSize() +" "+ grammasDrink.getDrink());

    }

    public ArrayList<String> getGrammasFave(){

        return newComboMeal;
    }

}