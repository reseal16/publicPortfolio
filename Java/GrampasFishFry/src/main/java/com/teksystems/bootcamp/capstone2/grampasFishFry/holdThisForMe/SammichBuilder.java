//package com.teksystems.bootcamp.capstone2.grampasFishFry.holdThisForMe;
//
//import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class SammichBuilder{
//    public static ArrayList<String> sammich() {
//        ArrayList<String> sammich = new ArrayList<>();
//        String fish = BuildFillet.fillet().toString();
//        boolean addToppings = true;
//
//        sammich.add("Bun");
//        sammich.add(fish);
//
//        System.out.println("Whatcha want on it?");
//        System.out.println(MakeItCustom.getToppings());
//
//        Scanner newTopping = new Scanner(System.in);
//
//        while (addToppings) {
//            if (newTopping.hasNextInt()) {
//                int addTopping = newTopping.nextInt();
//                sammich.add(MakeItCustom.setToppings(addTopping));
//                System.out.println("Anything else?");
//                System.out.println(MakeItCustom.getToppings());
//            } else if (!newTopping.hasNextInt()) {
//                addToppings = false;
//            }
//        }
//
//        return sammich;
//    }
//}
