package com.teksystems.bootcamp.java_exercises.factorByTwo;

public class ValueNode extends Node{
    private final int number;

    public ValueNode(int yourNumber) {
        super();
        this.number=yourNumber;

    }

    public int getCountOfTwos() {
        if (number == 2) {
            return 1;
        } else {
            return 0;
        }
    }

}
