package com.day05_regex_junit.regex_problem.find_repeating;

import java.util.regex.*;
import java.util.Scanner;

public class FindRepeatingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a sentence
        System.out.println("Enter a sentence: ");
        String text = scanner.nextLine();

        // Regex to find repeated words
        String regex = "\\b(\\w+)\\s+\\1\\b";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Repeating Words:");
        while (matcher.find()) {
            System.out.print(matcher.group(1) + " ");
        }

        scanner.close();
    }
}
