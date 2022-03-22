package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding;

public class Fish {

    private String fish;
    private String cut;
    private String breading;
    private static final double price = 4.99;

    public static double getPrice() {
        return price;
    }

    public void setFish(String fish){
        this.fish = fish;
    }
    public String getFish(){
        return this.fish;
    }
    public void setCut(String cut){
        this.cut = cut;
    }
    public String getCut(){
        return this.cut;
    }
    public void setBreading(String breading) {
        this.breading = breading;
    }
    public String getBreading(){

        return this.breading;
    }
}
