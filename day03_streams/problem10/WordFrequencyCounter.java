package com.day03_streams.problem10;

import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String filePath = "textfile.txt"; // Path of the text file
        Map<String, Integer> wordCountMap = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] words = line.toLowerCase().replaceAll("[^a-z ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Sorting the words by frequency (Descending Order)
            List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
            sortedWords.sort((a, b) -> b.getValue() - a.getValue());

            System.out.println("Top 5 most frequent words:");
            for (int i = 0; i < Math.min(5, sortedWords.size()); i++) {
                System.out.println(sortedWords.get(i).getKey() + " - " + sortedWords.get(i).getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: Unable to read the file.");
        }
    }
}
