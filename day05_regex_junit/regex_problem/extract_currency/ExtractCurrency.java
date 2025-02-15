package com.day05_regex_junit.regex_problem.extract_currency;

import java.util.regex.*;
import java.util.Scanner;

public class ExtractCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for a text containing currency values
        System.out.println("Enter a text with currency values: ");
        String text = scanner.nextLine();

        // Regex to match currency amounts (with or without $ symbol)
        String regex = "\\$?\\d+\\.\\d{2}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Extracted Currency Values:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        scanner.close();
    }
}
