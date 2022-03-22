//package com.teksystems.bootcamp.capstone2.grampasFishFry.holdThisForMe;
//
//import com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.customization.MakeItCustom;
//
//import java.util.ArrayList;
//
//public abstract class BuildEntree {
//
//    private static String breading;
//    private ArrayList<String> toppings = new ArrayList<String>();
//    private static String fish;
//    private boolean bun = false;
//
//    public static String setFish(int itemNumber){
//        fish = MakeItCustom.setFish(itemNumber);
//        return fish;
//    }
//
//    public String getFish(){
//        return fish;
//    }
//
//    public static String setBreading(int itemNumber){
//        breading = MakeItCustom.setBreading(itemNumber);
//        return breading;
//    }
//
//    public String getBreading(){
//        return breading;
//    }
//
//    public void setBun(boolean bun) {
//        this.bun=bun;
//    }
//
//    public boolean getBun(){
//        return bun;
//    }
//
//    public void setToppings(int itemNumber){
//        toppings.add(MakeItCustom.setToppings(itemNumber));
//    }
//
//    public void removeToppings(int itemNumber){
//        toppings.remove(itemNumber);
//    }
//
//    public ArrayList<String> getToppings(){
//        return toppings;
//    }
//
//}