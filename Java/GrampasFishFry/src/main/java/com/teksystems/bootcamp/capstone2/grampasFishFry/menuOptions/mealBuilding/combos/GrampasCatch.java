package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos;

import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Drink;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Fish;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.CustomizationOptions;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Side;

import java.util.ArrayList;
import java.util.Scanner;

public class GrampasCatch{
    Scanner input = new Scanner(System.in);

    private Fish grampasFish;
    private Side grampasSide;
    private Drink grampasDrink;
    private ArrayList<String> newComboMeal = new ArrayList();

    public void grampasFish() {
        grampasFish = new Fish();
        grampasFish.setFish(CustomizationOptions.setFish(1));
        grampasFish.setCut(CustomizationOptions.setCut(1));
        grampasFish.setBreading(CustomizationOptions.setBreading(1));

        newComboMeal.add(grampasFish.getFish()+" "+grampasFish.getCut()+" "+grampasFish.getBreading());

    }

    public void grampasSide(){
        grampasSide = new Side();
        System.out.println("Whatcha want with it?");
        System.out.println(CustomizationOptions.getSide());
        int i = input.nextInt();
        grampasSide.setSide(CustomizationOptions.setSide(i));

        System.out.println("How much?");
        System.out.println(CustomizationOptions.getSize());
        i = input.nextInt();

        grampasSide.setSize(CustomizationOptions.setSize(i));

        newComboMeal.add(grampasSide.getSize() +" "+ grampasSide.getSide());

    }

    public void grampasDrink(){
        grampasDrink = new Drink();
        System.out.println("Whatcha wanna drink?");
        System.out.println(CustomizationOptions.getDrink());
        int i = input.nextInt();
        grampasDrink.setDrink(CustomizationOptions.setDrink(i));

        System.out.println("How big?");
        System.out.println(CustomizationOptions.getSize());
        i = input.nextInt();

        grampasDrink.setSize(CustomizationOptions.setSize(i));

        newComboMeal.add(grampasDrink.getSize() +" "+ grampasDrink.getDrink());

    }

    public ArrayList getGrampasCatch() {
        return newComboMeal;
    }
}
