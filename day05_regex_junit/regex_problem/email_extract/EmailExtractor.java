package com.day05_regex_junit.regex_problem.email_extract;

import java.util.regex.*;
import java.util.Scanner;

public class EmailExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input text from the user
        System.out.println("Enter the text: ");
        String text = scanner.nextLine();

        // Simple regex pattern for email extraction
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(regex); // Compile regex
        Matcher matcher = pattern.matcher(text); // Match pattern in input text

        System.out.println("\nExtracted Email Addresses:");
        boolean found = false;

        while (matcher.find()) {
            System.out.println(matcher.group()); // Print found emails
            found = true;
        }

        if (!found) {
            System.out.println("No valid email addresses found!");
        }

        scanner.close(); // Closing scanner
    }
}
