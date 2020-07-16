package com.galvanize;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        // given string "supercalifragilisticexpialidocious", count number of character occurences
        HashMap<Character, Integer> result = characterFrequency("supercalifragilisticexpialidocious");

        System.out.println(result);
    }

    public static HashMap<Character, Integer> characterFrequency(String str) {
        /*
        1. Setup your accumulator with an initial state, blank, or zero
        2. Setup your return of that accumulator
        3. Given input data, loop or .reduce() to incrementally accumulate results (tally)
        4. Return your tallied answer
         */

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : str.toCharArray()) {
            int count = 1;
            if (map.containsKey(ch)) {
                // could be defensive and check datatypes before casting... or could just be upfront with types
                count = map.get(ch) + 1;
            }
            map.put(ch, count);
        }

        return map;
    }
}