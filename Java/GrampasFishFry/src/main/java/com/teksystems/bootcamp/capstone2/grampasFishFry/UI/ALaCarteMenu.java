package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import java.util.Scanner;

public class ALaCarteMenu {
    static void aLaCarteMenu() {
        Scanner input = new Scanner(System.in);
        int i;
        System.out.println("Which one ye wanna get?");
        System.out.println("1 = Fish, 2 = Sides, 3 = Drinks");

        i = input.nextInt();

        switch(i){
            case 1:
                AddFishUI.createNewFishItem();
                break;
            case 2:

            case 3:
                AddDrinkUI.createNewDrink();
                break;
            default:
                System.out.println("Hold up, let's start over on that");
                MenuNavigationUI.startMenu();
                break;
        }

    }
}
