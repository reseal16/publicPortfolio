package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos;

import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
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
        System.out.println(MakeItCustom.getFish());
        int i = input.nextInt();

        grammasFish.setFish(MakeItCustom.setFish(i));
        grammasFish.setCut(MakeItCustom.setCut(2));

        System.out.println("What kind of breading?");
        System.out.println(MakeItCustom.getBreading());
        i= input.nextInt();
        grammasFish.setBreading(MakeItCustom.setBreading(i));

        newComboMeal.add(grammasFish.getFish()+" "+grammasFish.getCut()+" "+grammasFish.getBreading());

    }

    public void grammasSide(){
        grammasSide = new Side();
        System.out.println("Whatcha want with it?");
        System.out.println(MakeItCustom.getSide());
        int i = input.nextInt();
        grammasSide.setSide(MakeItCustom.setSide(i));

        System.out.println("How much?");
        System.out.println(MakeItCustom.getSize());
        i = input.nextInt();

        grammasSide.setSize(MakeItCustom.setSize(i));

        newComboMeal.add(grammasSide.getSize() +" "+ grammasSide.getSide());

    }

    public void grammasDrink(){
        grammasDrink = new Drink();
        System.out.println("Whatcha wanna drink?");
        System.out.println(MakeItCustom.getDrink());
        int i = input.nextInt();
        grammasDrink.setDrink(MakeItCustom.setDrink(i));

        System.out.println("How big?");
        System.out.println(MakeItCustom.getSize());
        i = input.nextInt();

        grammasDrink.setSize(MakeItCustom.setSize(i));

        newComboMeal.add(grammasDrink.getSize() +" "+ grammasDrink.getDrink());

    }

    public ArrayList<String> getGrammasFave(){

        return newComboMeal;
    }

}