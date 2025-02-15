package com.day05_regex_junit.regex_problem.validatea_license_plate_number;

import java.util.regex.*;
import java.util.Scanner;

public class ValidateLicensePlateNumber {

    // Method to validate license plate number (Format: 2 uppercase letters + 4 digits)
    public static boolean isValidLicensePlate(String plate) {
        Pattern pattern = Pattern.compile("^[A-Z]{2}[0-9]{4}$"); // Compiling the regex pattern
        Matcher matcher = pattern.matcher(plate); // Creating a matcher for input string
        return matcher.matches(); // Checking if the pattern matches
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking license plate input from user
        System.out.print("Enter a license plate number: ");
        String plateInput = scanner.nextLine();

        // Checking if it matches the pattern
        if (isValidLicensePlate(plateInput)) {
            System.out.println(" Valid License Plate");
        } else {
            System.out.println(" Invalid License Plate");
        }

        scanner.close(); // Closing scanner to prevent resource leak
    }
}
