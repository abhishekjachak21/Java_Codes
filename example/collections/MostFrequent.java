package com.example.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequent {
    
    public static void main(String[] args) {
        String str = "I went to the college to play the cricket of the game and I love the cricket game";
        
        // Split the string into a list of words
        List<String> data = Arrays.asList(str.split(" "));
        System.out.println(data);

        Map<String, Integer> wordCount = new HashMap<>();

        // Count frequencies of each word
        for (String s : data) {
            // Normalize the word to lowercase for case-insensitive counting
            s = s.toLowerCase();
            wordCount.put(s, wordCount.getOrDefault(s, 0) + 1);
        }

        int max = 0;
        String maxKey = "";

        // Find the most frequent word
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (max < entry.getValue()) {
                max = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        
        System.out.println("Most Frequent Word: '" + maxKey + "' with frequency: " + max);
    }
}
