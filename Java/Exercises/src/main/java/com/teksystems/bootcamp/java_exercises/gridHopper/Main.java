package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner yourNumber = new Scanner(System.in);
        int size;
        int seed;
        LocationPointer[][] yourBoard;
        System.out.println("Please enter board size: ");
        size = yourNumber.nextInt();

        System.out.println("Please enter seed: ");
        seed = yourNumber.nextInt();

        yourBoard = BoardGenerator.createBoard(size, seed);

    }
}