package com.teksystems.bootcamp.java_exercises.findCharacters;

import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

public class CharFinder {
    public static void main(String[] args) {
        String charsToFind;
        String stringToSearch;
        String charInput;
        String searchString;
        HashMap searchResults = new HashMap<Character, List<Integer>>();


        Scanner stringInput = new Scanner(System.in);

        System.out.println("What would you like to search for?");
        charsToFind = stringInput.nextLine();

        System.out.println("Where would you like to search for this?");
        stringToSearch = stringInput.nextLine();

        stringInput.close();

        searchResults = findMatchPositions(charsToFind, stringToSearch);



        System.out.println("Search results: " + searchResults);
    }


    public static HashMap<Character, List<Integer>> findMatchPositions(String charsToFind, String stringToSearch){
       char[] findThese;
       int tempIndex;
       HashMap tempMap = new HashMap<Character, List<Integer>>();

       findThese = parseStringToCharArray(charsToFind);


       for(int i=0; i<findThese.length; i++) {
           tempIndex = 0;
           tempIndex = stringToSearch.indexOf(findThese[i], tempIndex);
           if (tempIndex >= 0) {
               tempMap.put(findThese[i], tempIndex);
           }
       }

       return tempMap;

    }

    public static char[] parseStringToCharArray (String scanInput){
        char[] tempArray = new char [scanInput.length()];

        tempArray = scanInput.toCharArray();
        return tempArray;

    }

}

