package com.galvanize;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrs {

    public Arrs() {
        // cars

        // one way
        String[] cars2 = new String[]{"Lamborghini Miura", "Toyota Celica", "Nissan 300Z"};
        // or
        String[] cars = {"Lamborghini Miura", "Toyota Celica", "Nissan 300Z"};
        // or
        String[] cars3 = new String[3];

        // access
        System.out.println(cars2[1]);

        // normal loop
        for (int i=0; i<cars2.length; i++) {
            System.out.println(cars2[i]);
        }

        // foreach loop
        for (String car : cars2) {
            System.out.println(car);
        }


        //        // NORMAL arrays... very limited
        //        // CANNOT CHANGE THE SIZE!!
        //        // NO CONVENIENCE FUNCTIONS (push, pop, add, remove)

        // ---------------------------------------------------------------

        ArrayList<String> cars4 = new ArrayList<>();
        cars4.add("Miura");
        cars4.add("Celica");

        // foreach HOF
        cars4.forEach((n) -> System.out.println(n));

        // Inline populate
        ArrayList<String> cars5 = new ArrayList<>(Arrays.asList("volvo", "toyota", "subaru", "datsun"));

        // access
        System.out.println(cars5.get(1));

        // 2D ArrayLists
        ArrayList<ArrayList> biggerAL = new ArrayList<>();
        biggerAL.add(cars5);
        System.out.println(biggerAL.toString());

        cars5.sort(null);

        // pop()
        cars5.remove(cars5.size()-1);

        // foreach
        for (String car : cars5) {
            System.out.println(car);
        }
    }
}
