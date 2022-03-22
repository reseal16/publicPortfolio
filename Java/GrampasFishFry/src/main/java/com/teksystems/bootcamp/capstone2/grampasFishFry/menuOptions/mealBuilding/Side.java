package com.teksystems.bootcamp.capstone2.grampasFishFry.menuOptions.mealBuilding;

public class Side {

    private String side;
    private String size;
    private static double price;

    public void setSide(String side){
        this.side = side;
    }
    public String getSide(){
        return this.side;
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
            default:
                System.out.println("I didn't catch how much ye wanted...");
                break;

        }
    }
    public static double getPrice(){
        return price;
    }
}
