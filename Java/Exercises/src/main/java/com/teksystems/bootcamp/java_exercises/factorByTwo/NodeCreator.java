package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class NodeCreator {
    public static Node createNode(int number){
        Node node;
        if (number == 2 || number%2!=0) {
            return node = new ValueNode(number);

        } else {
            return node = new PointerNode(createNode(number / 2), createNode(2));

        }

    }

}
