package com.day05_regex_junit.regex_problem.extract_links;

import java.util.regex.*;
import java.util.Scanner;

public class LinkExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter a text containing URLs
        System.out.println("Enter text containing URLs: ");
        String text = scanner.nextLine();

        // Regular expression to match URLs starting with http or https
        // \S+ ensures that the URL continues until the first space or newline
        String regex = "https?://\\S+";

        // Create a pattern object using the regex
        Pattern pattern = Pattern.compile(regex);

        // Create a matcher object to find occurrences in the input text
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Links:");
        while (matcher.find()) {
            // Print each URL found in the text
            System.out.print(matcher.group() + " ");
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
