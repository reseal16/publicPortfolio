package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {
    public BoardHopper(LocationPointer[][] yourBoard) {
    }

    public static LocationPointer[][] hop(LocationPointer[][] board) {
        int hops;
        int [][] coordinatesXY;
        int x = 0;
        int y = 0;
        LocationPointer[][] currentHop;

        for (hops = 100; hops > 0; hops --){

            coordinatesXY = LocationPointer.getLocation(x,y);
            x = coordinatesXY [0][0];
            y = coordinatesXY [1][1];

        }

        x=0;
        y=0;

        currentHop = new LocationPointer[x][y];

        return currentHop;
    }



}


