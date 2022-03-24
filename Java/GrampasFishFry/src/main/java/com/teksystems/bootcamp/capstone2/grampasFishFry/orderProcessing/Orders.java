package com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing;

import com.teksystems.bootcamp.capstone2.grampasFishFry.UI.ProgramStart;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Orders {
    protected static HashMap newOrder = new HashMap<List<Integer>, String>();
    protected static HashMap orderListByNumber = new HashMap <List<Integer>, HashMap>();
    protected static int orderNumber = 101;
    protected static int lineItem = 1;

    public static void addToOrder(String addLineToOrder){
        newOrder.put(lineItem, addLineToOrder);
        lineItem++;
    }

    public static HashMap getCurrentOrder(){
        return newOrder;
    }

    public static void finalizeOrder(){
        orderListByNumber.put(orderNumber, newOrder);
        orderNumber++;
        newOrder.clear();
        lineItem=1;
    }

    public static Object getPastOrder(int order){

        return orderListByNumber.get(order);
    }

    public static void orderLookup(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your order number.");
        int i = input.nextInt();
        Orders.getPastOrder(i);
        ProgramStart.programStart();
    }
}
