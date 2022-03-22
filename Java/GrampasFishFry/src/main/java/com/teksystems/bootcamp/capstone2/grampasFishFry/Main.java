package com.teksystems.bootcamp.capstone2.grampasFishFry;

import com.teksystems.bootcamp.capstone2.grampasFishFry.UI.MenuSelection;
import com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing.Orders;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        programStart();

        System.out.println("Closing program");
        System.exit(0);
    }

    public static void programStart(){
        System.out.println("**GRAMPA'S FISH FRY**");
        System.out.println("Yer ma's cookin, whatcha want fer dinner?");
        System.out.println("1 = Menu, 2 = Find order, 3 = Current Order, 4 = Finalize Order, 5 = Exit");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();

        do {
            switch (i){
                case 1:
                    MenuSelection.startMenu();
                    break;
                case 2:
                    MenuSelection.orderLookup();
                    programStart();
                    break;
                case 3:
                    System.out.println(Orders.getCurrentOrder());
                    programStart();
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
                    programStart();
                    break;
            }

        } while (input.hasNextInt());
        System.out.println("Closing program");
        System.exit(0);

    }

}