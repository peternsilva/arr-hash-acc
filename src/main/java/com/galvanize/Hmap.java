package com.galvanize;

import java.util.HashMap;

public class Hmap {
    public Hmap() {
        // phone book, phone number -> name
        HashMap<Integer, String> phoneBook = new HashMap<>();
        phoneBook.put(8675309, "Jenny");
        phoneBook.put(5551234, "Johnny");

        phoneBook.forEach((key, value) -> System.out.println(value));

        System.out.println(phoneBook.get(8675309));
    }
}
