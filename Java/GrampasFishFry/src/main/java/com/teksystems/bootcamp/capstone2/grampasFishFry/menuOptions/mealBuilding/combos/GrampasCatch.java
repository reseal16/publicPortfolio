package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos;

import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Drink;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Fish;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
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
        grampasFish.setFish(MakeItCustom.setFish(1));
        grampasFish.setCut(MakeItCustom.setCut(1));
        grampasFish.setBreading(MakeItCustom.setBreading(1));

        newComboMeal.add(grampasFish.getFish()+" "+grampasFish.getCut()+" "+grampasFish.getBreading());

    }

    public void grampasSide(){
        grampasSide = new Side();
        System.out.println("Whatcha want with it?");
        System.out.println(MakeItCustom.getSide());
        int i = input.nextInt();
        grampasSide.setSide(MakeItCustom.setSide(i));

        System.out.println("How much?");
        System.out.println(MakeItCustom.getSize());
        i = input.nextInt();

        grampasSide.setSize(MakeItCustom.setSize(i));

        newComboMeal.add(grampasSide.getSize() +" "+ grampasSide.getSide());

    }

    public void grampasDrink(){
        grampasDrink = new Drink();
        System.out.println("Whatcha wanna drink?");
        System.out.println(MakeItCustom.getDrink());
        int i = input.nextInt();
        grampasDrink.setDrink(MakeItCustom.setDrink(i));

        System.out.println("How big?");
        System.out.println(MakeItCustom.getSize());
        i = input.nextInt();

        grampasDrink.setSize(MakeItCustom.setSize(i));

        newComboMeal.add(grampasDrink.getSize() +" "+ grampasDrink.getDrink());

    }

    public ArrayList getGrampasCatch() {
        return newComboMeal;
    }
}
