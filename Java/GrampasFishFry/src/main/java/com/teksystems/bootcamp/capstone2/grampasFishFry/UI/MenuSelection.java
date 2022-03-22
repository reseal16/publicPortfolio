package com.teksystems.bootcamp.capstone2.grampasFishFry.UI;

import com.teksystems.bootcamp.capstone2.grampasFishFry.Main;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.Scanner;

public class MenuSelection {
    public static void startMenu(){
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println(Menu.getMenu());
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

    private static void aLaCarteMenu() {
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
                AddDrinkUI.createNewDrinkItem();
                break;
            default:
                System.out.println("Hold up, let's start over on that");
                MenuSelection.startMenu();
                break;
        }

    }

    public static void comboMenu(){
        Scanner input = new Scanner(System.in);
        int i;

        System.out.println("Which one ye want?");
        System.out.println(Menu.getComboMenu());

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
                MenuSelection.comboMenu();
                break;
        }

    }

    public static void orderLookup(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your order number.");
        int i = input.nextInt();
        Orders.getPastOrder(i);
        Main.programStart();
    }
}
