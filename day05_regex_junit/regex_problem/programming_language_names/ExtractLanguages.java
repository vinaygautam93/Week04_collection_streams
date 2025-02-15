package com.day05_regex_junit.regex_problem.programming_language_names;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input text
        System.out.println("Enter a sentence with programming languages: ");
        String text = scanner.nextLine();

        // Regex to find common programming languages
        String regex = "\\b(Java|Python|JavaScript|Go|C|C\\+\\+|Ruby|Swift)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Languages:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        scanner.close();
    }
}
