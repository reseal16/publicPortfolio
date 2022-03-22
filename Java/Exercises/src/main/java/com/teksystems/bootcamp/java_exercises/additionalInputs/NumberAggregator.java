package com.teksystems.bootcamp.java_exercises.additionalInputs;

import java.util.Scanner;

public class NumberAggregator {

    public static void main (String[] args) {
        int total = 0;
        boolean newNumber;
        int yourNumber;

        do {
            System.out.println("Enter a number:");
            Scanner enterNumber = new Scanner(System.in);

            newNumber = enterNumber.hasNextInt();

            if (newNumber) {
                yourNumber = enterNumber.nextInt();

                total = addNumber(yourNumber, total);
                System.out.println("Current total is: " + total);

            } else {
                System.out.println("The value entered is not a valid integer.");
                System.out.println("Final total: " + total);
                System.out.println("Closing Program.");
                enterNumber.close();

            }
        }while (newNumber);

    }

    public static int addNumber (int number, int total) {

       total = number + total;

       return total;

    }


}
