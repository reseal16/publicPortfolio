package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding;

public class Drink {

    private String drink;
    private String size;
    private double price;

    public void setDrink(String drink){
        this.drink = drink;
    }
    public String getDrink(){
        return this.drink;
    }
    public void setSize(String size){
        this.size = size;
    }
    public String getSize(){
        return this.size;
    }
    public void setPrice(){
        switch(this.size){
            case "Small":
                price = 1.00;
                break;
            case "Medium":
                price = 1.50;
                break;
            case "Large":
                price = 2.00;
                break;
            case "Country Large":
                price = 2.50;
                break;

        }
    }
    public double getPrice(){
        return price;
    }
}
