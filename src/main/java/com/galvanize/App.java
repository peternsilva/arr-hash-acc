package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        //Instantiate an empty ArrayList
        ArrayList<String> addresses = new ArrayList<>();

        //Add elements to an ArrayList
        addresses.add("123 E Bose St");
        addresses.add("189 W Sennheiser St");

        //Instantiate and initialize with elements
        ArrayList<Integer> evenNumbers = new ArrayList<>(Arrays.asList(2, 4, 8, 6));

        //Initialize an ArrayList from an existing Array
        String[] products = new String[]{"Magic Vest", "Old Staff", "Spurious Rock"};
        ArrayList<String> productList = new ArrayList<>(Arrays.asList(products));


        //Access and print the second element in the 'addresses' ArrayList
        String addressToPrint = addresses.get(1);
        System.out.println(addressToPrint);

        //Instantiate the ArrayList
        ArrayList<Double> numberList = new ArrayList<>();

        numberList.add(0.9);
        numberList.add(1.0);
        numberList.add(0.3);
        numberList.add(0.4);

        numberList.sort(null);

        System.out.println(numberList.toString());

        // --------------------------------------------

        HashMap<Integer, String> phoneMap = new HashMap<>();

        phoneMap.put(8675309, "Jenny");
        phoneMap.put(5551234, "Johnny");
        phoneMap.put(8889876, "Butch");

        System.out.println(phoneMap.get(8675309));
    }
}
