package com.teksystems.bootcamp.java_exercises.factorByTwo;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int yourNumber;
        boolean hasNumber;
        Node factorsOfTwo;

        System.out.println("Enter a number:");
        Scanner enterNumber = new Scanner(System.in);

        hasNumber = enterNumber.hasNextInt();
        yourNumber = enterNumber.nextInt();

        if (yourNumber == 0) {
            System.out.println("Momma always said not to divide by zero in the house.");

        } else if (hasNumber) {

            factorsOfTwo = NodeCreator.createNode(yourNumber);

            System.out.println("Number of twos found in " + yourNumber + " is " + factorsOfTwo.getCountOfTwos());

        } else {
                System.out.println("The value entered is not a valid number.");
                System.out.println("Closing Program.");
                enterNumber.close();

        }
    }
}
