package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {
    public static LocationPointer[][] hop(LocationPointer[][] board) {
        int hops = 100;
        int [][] coordinatesXY = {{0,0},{0,0}};
        int x = coordinatesXY [0][0];
        int y = coordinatesXY [1][1];
        LocationPointer[][] currentHop;


        if (hops >0){
            hops = hops-1;
            coordinatesXY = LocationPointer.getLocation(x,y);
            if (x == coordinatesXY [0][0] && y == coordinatesXY [1][1]){
                currentHop = new LocationPointer[x][y];
                return currentHop;
            }


            x = coordinatesXY [0][0];
            y = coordinatesXY [1][1];

            currentHop = new LocationPointer[x][y];

        } else {
            currentHop = new LocationPointer[x][y];
        }

        return currentHop;
    }

}


package com.teksystems.bootcamp.java_exercises.gridHopper;

        import java.util.Random;

public class BoardGenerator {
    public static LocationPointer[][] createBoard(int size, int seed){

        Random randomX = new Random(size-1);
        Random randomY = new Random(size-1);
        int x = randomX.nextInt();
        int y = randomY.nextInt();

        return new LocationPointer[x][y];
    }
}


package com.teksystems.bootcamp.java_exercises.gridHopper;

public class LocationPointer {

    public static int [][] getLocation(int getTargetX, int getTargetY){

        return getLocation(getTargetX, getTargetY);

    }
}

package com.teksystems.bootcamp.java_exercises.gridHopper;

public class BoardHopper {
    public static LocationPointer[][] hop(LocationPointer[][] board) {
        int hops;
        int [][] coordinatesXY;
        int x = 0;
        int y = 0;
        LocationPointer[][] currentHop;
        if (x == coordinatesXY [0][0] && y == coordinatesXY [1][1])
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

package com.teksystems.bootcamp.java_exercises.gridHopper;

public class LocationPointer {

    public static int [][] getLocation(int getTargetX, int getTargetY){

        return getLocation(getTargetX, getTargetY);

    }
}
