package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.Main;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos.GrammasFave;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.combos.GrampasCatch;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

public class AddComboUI {

    public static void grampasCatch(){
        GrampasCatch createCombo = new GrampasCatch();
        createCombo.grampasFish();
        createCombo.grampasSide();
        createCombo.grampasDrink();

        String adding = String.valueOf(createCombo.getGrampasCatch());
        Orders.addToOrder(adding);
        System.out.println("Added "+ createCombo.getGrampasCatch());
        ProgramStart.programStart();
    }

    public static void grammasFave(){
        GrammasFave createCombo = new GrammasFave();
        createCombo.grammasFish();
        createCombo.grammasSide();
        createCombo.grammasDrink();

        String adding = String.valueOf(createCombo.getGrammasFave());
        Orders.addToOrder(adding);
        System.out.println("Added "+ createCombo.getGrammasFave());
        ProgramStart.programStart();
    }
}
