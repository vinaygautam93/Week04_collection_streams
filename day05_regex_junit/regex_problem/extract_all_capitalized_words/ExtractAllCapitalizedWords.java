package com.day05_regex_junit.regex_problem.extract_all_capitalized_words;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractAllCapitalizedWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input sentence from user
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();

        // Regex for capitalized words (words starting with uppercase letter)
        String regex = "\\b[A-Z][a-z]*\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Capitalized Words:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        scanner.close();
    }
}
