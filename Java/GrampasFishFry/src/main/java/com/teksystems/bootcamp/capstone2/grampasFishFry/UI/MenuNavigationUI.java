package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.Scanner;

import static com.teksystems.bootcamp.capstone2.grampasFishFry.UI.ALaCarteMenu.aLaCarteMenu;
import static com.teksystems.bootcamp.capstone2.grampasFishFry.UI.ComboMenu.comboMenu;

public class MenuNavigationUI {
    public static void startMenu(){
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println(MenuItemList.getMenu());
        System.out.println("Ye want somethin we already got or ye want somethin made up?");
        System.out.println("Enter a number to continue");
        System.out.println("1 = Combos, 2 = Start from scratch, 3 = What's my order?, 4 = Finish Order, 5 = Exit");

        i = input.nextInt();
            switch (i) {
                case 1:
                    comboMenu();
                    break;
                case 2:
                    aLaCarteMenu();
                    break;
                case 3:
                    System.out.println(Orders.getCurrentOrder());
                    break;
                case 4:
                    Orders.finalizeOrder();
                    break;
                case 5:
                    System.out.println("Closing program");
                    System.exit(0);
                    break;
                default:
                    System.out.println("That don't seem right, let's start over.");
                    startMenu();
                    break;
            }
    }
}
