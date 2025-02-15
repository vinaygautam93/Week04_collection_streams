package com.day05_regex_junit.regex_problem.extract_dates;

import java.util.regex.*;
import java.util.Scanner;

public class DateExtractor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input text from user
        System.out.println("Enter a text containing dates: ");
        String text = scanner.nextLine();

        // Regex for dates in dd/mm/yyyy format
        String regex = "\\b(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("\nExtracted Dates:");
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

        scanner.close();
    }
}
