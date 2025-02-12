package com.day02_collection.map_interface.problem01;

import java.util.*;

class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "Hello world, hello Java!";
        System.out.println(countWordFrequency(text));
    }

    // Function to count word frequency
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase(); // Remove punctuation, convert to lowercase
        String[] words = text.split("\\s+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}
