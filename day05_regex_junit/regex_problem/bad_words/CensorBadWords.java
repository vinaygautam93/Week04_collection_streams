package com.day05_regex_junit.regex_problem.bad_words;

import java.util.Scanner;

public class CensorBadWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define a list of bad words (customizable)
        String[] badWords = { "damn", "stupid" };

        // Ask the user to enter a sentence
        System.out.println("Enter a sentence: ");
        String input = scanner.nextLine();

        // Replace each bad word with ****
        for (String badWord : badWords) {
            input = input.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        // Print the censored sentence
        System.out.println("Censored Sentence: " + input);

        scanner.close();
    }
}
