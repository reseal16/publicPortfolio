package com.teksystems.bootcamp.java_exercises.gridHopper;

import java.util.Random;

public class BoardGenerator {
    public static LocationPointer[][] createBoard(int size, int seed){

        Random randomX = new Random(size-1);
        Random randomY = new Random(size-1);
        int x = randomX.nextInt(seed);
        int y = randomY.nextInt(seed);


        return new LocationPointer[x][y];
    }
}
