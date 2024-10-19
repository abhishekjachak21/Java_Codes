package com.example.collections;
import java.util.*;



public class MapExample {

    public static boolean areAnagrams(String str1, String str2) {
       
        if (str1.length() != str2.length()) {
            return false;
        }

    
        Map<Character, Integer> charCount = new HashMap<>();

        // Count characters in the first string
        for (char c : str1.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Subtract the count using characters from the second string
        for (char c : str2.toCharArray()) {
            if (!charCount.containsKey(c)) {
                return false; // If the character is not present in the map
            }
            charCount.put(c, charCount.get(c) - 1);
            if (charCount.get(c) == 0) {
                charCount.remove(c); // Remove character with zero count
            }
        }

        // If map is empty, they are anagrams
        return charCount.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        // Simple print of the result
        System.out.println(areAnagrams(str1, str2) ? "They are Anagrams" : "They are Not Anagrams");
    }
}






//public class MapExample {
//
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 1, 2, 1, 3, 4, 1, 5, 6, 7, 3, 1, 2};
//
//        // Creating a HashMap to store element and their counts
//        Map<Integer, Integer> m1 = new HashMap<>();
//
//        // Loop through the array
//        for (int x : arr) {
//            // If the element already exists in the map, increment the count
//            if (m1.containsKey(x)) {
//                m1.put(x, m1.get(x) + 1);
//            } else {
//                // Otherwise, add it with count 1
//                m1.put(x, 1);
//            }
//        }
//
//        // Print the map
//        System.out.println(m1);
//    }
//}
