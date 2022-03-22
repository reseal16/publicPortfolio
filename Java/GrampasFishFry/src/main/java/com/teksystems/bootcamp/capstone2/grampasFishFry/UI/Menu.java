package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding.Fish;
import java.util.HashMap;
import java.util.List;

public class Menu {
    private static final HashMap menu = new HashMap<List<Integer>, String>();

    public static HashMap getMenu(){
        menu.put(1, "Grampa's Catch");
        menu.put(2, "Gramma's Favorite");
        menu.put(3, "Fish Sammich Combo");

        System.out.println("COMBOS");
        System.out.println("$9.99");
        System.out.println(menu);
        System.out.println("***************");
        System.out.println("FISH N FROG LEGS");
        System.out.println("$"+ Fish.getPrice());
        System.out.println(MakeItCustom.getFish());
        System.out.println("***************");
        System.out.println("CUTS");
        System.out.println(MakeItCustom.getCut());
        System.out.println("***************");
        System.out.println("BREAD'N");
        System.out.println(MakeItCustom.getBreading());
        System.out.println("***************");
        System.out.println("SIDES");
        System.out.println("Small - $1.00, Medium - $1.50, Large - $2.00, Country Large - $2.50");
        System.out.println(MakeItCustom.getSide());
        System.out.println("***************");
        System.out.println("DRINKS");
        System.out.println("Small - $1.00, Medium - $1.50, Large - $2.00, Country Large - $2.50");
        System.out.println(MakeItCustom.getDrink());
        System.out.println("***************");
        System.out.println("COKE");
        System.out.println(MakeItCustom.getSoda());

        return menu;
    }

    public static HashMap getComboMenu(){
        return menu;
    }
}
