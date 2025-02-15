package com.day05_regex_junit.regex_problem.social_security_number;

import java.util.Scanner;

public class ValidateSSN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for SSN
        System.out.println("Enter a Social Security Number: ");
        String ssn = scanner.nextLine();

        // Regex for SSN format (xxx-xx-xxxx)
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        boolean isValid = ssn.matches(regex);

        System.out.println("Valid SSN: " + isValid);

        scanner.close();
    }
}
