package com.day05_regex_junit.regex_problem.replace_and_modify_strings;

import java.util.Scanner;

public class ReplaceMultipleSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a sentence with multiple spaces
        System.out.println("Enter a sentence with extra spaces: ");
        String input = scanner.nextLine();

        // Replace multiple spaces with a single space using regex
        String result = input.replaceAll("\\s+", " ");

        // Print the cleaned-up sentence
        System.out.println("Formatted Sentence: " + result);

        scanner.close();
    }
}
