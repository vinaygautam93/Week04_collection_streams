package com.day02_collection.list_interface.problem02;

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange");

        // Map to store the frequency count
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : items) {
            // Increment count if already exists, otherwise initialize to 1
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("Element Frequency: " + frequencyMap);
    }
}
