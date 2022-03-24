package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import java.util.Scanner;

public class ComboMenu {
    public static void comboMenu(){
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("Which one ye want?");
        System.out.println(MenuItemList.getComboMenu());

        i = input.nextInt();

        switch (i){
            case 1:
                AddComboUI.grampasCatch();
                break;
            case 2:
                AddComboUI.grammasFave();
                break;
            default:
                System.out.println("Hold up, let's start over on that");
                comboMenu();
                break;
        }

    }
}
