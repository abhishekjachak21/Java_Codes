package com.example.collections;

// List => An ordered collection that allows duplicates.
// Set => An unordered collection of unique elements.
// Map => A collection of key-value pairs, where each key is unique.

import java.util.*;

public class Master {

    public static void main(String[] args) {
        // Using List
        List<Integer> list1 = new ArrayList<>();
        list1.add(43);
        list1.add(54);
        list1.add(41);
        list1.add(14);
        list1.add(9);
        System.out.println("List element at index 4 :"+list1.get(4));
        System.out.println("List elements:");
        for (Integer x : list1) {
            System.out.println(x); // Iterating through the List
        }

        // Using Set
        Set<Integer> set1 = new HashSet<>();
        set1.add(43);
        set1.add(54);
        set1.add(41);
        set1.add(14);
        set1.add(9);
        set1.add(43); // Duplicate, will be ignored
        System.out.println("\nSet elements:");
        for (Integer x : set1) {
            System.out.println(x); // Iterating through the Set
        }

        // Using Map
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");
        map1.put(1, "Avocado"); // This will overwrite the value for key 1
        System.out.println("\nMap elements:");
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
