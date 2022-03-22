//package com.teksystems.bootcamp.capstone2.grampasFishFry.holdThisForMe;
//
//import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class FishNugget {
//    public static ArrayList<String> nugget(){
//        ArrayList<String> nugget = new ArrayList<>();
//        String fish;
//        String breading;
//        Scanner nuggetInput = new Scanner(System.in);
//        System.out.println("Pick yer fish: ");
//        System.out.println(MakeItCustom.getFish());
//
//        int fishNumber = nuggetInput.nextInt();
//        fish = BuildEntree.setFish(fishNumber);
//
//        System.out.println("Pick yer breading: ");
//        System.out.println(MakeItCustom.getBreading());
//
//        int breadingNumber = nuggetInput.nextInt();
//        breading = BuildEntree.setBreading(breadingNumber);
//
//        nugget.add(fish);
//        nugget.add(breading);
//
//        return nugget;
//    }
//}
