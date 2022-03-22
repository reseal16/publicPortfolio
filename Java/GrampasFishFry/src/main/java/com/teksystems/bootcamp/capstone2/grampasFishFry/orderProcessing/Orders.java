package com.teksystems.bootcamp.capstone2.grampasFishFry.orderProcessing;

import java.util.HashMap;
import java.util.List;

public class Orders {
    private static HashMap newOrder = new HashMap<List<Integer>, String>();
    private static HashMap orderList = new HashMap <List<Integer>, HashMap>();
    private static int i = 101;
    static int lineItem = 1;

    public static void addToOrder(String addMe){
        newOrder.put(lineItem, addMe);
        lineItem++;
    }

    public static HashMap getCurrentOrder(){
        return newOrder;
    }

    public static void finalizeOrder(){
        orderList.put(i, newOrder);
        i++;
        newOrder.clear();
        lineItem=1;
    }

    public static Object getPastOrder(int order){

        return orderList.get(order);
    }
}
