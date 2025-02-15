package com.day05_regex_junit.regex_problem.validate_hexa_color;

import java.util.regex.*;
import java.util.Scanner;

public class HexaColor {

    // Method to validate hex color code (Format: # followed by 6 hex characters)
    public static boolean isValidHexColor(String color) {
        Pattern pattern = Pattern.compile("^#[0-9A-Fa-f]{6}$"); // Compiling the regex pattern
        Matcher matcher = pattern.matcher(color); // Creating a matcher for input string
        return matcher.matches(); // Checking if the pattern matches
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking hex color input from user
        System.out.print("Enter a hex color code: ");
        String colorInput = scanner.nextLine();

        // Checking if it matches the pattern
        if (isValidHexColor(colorInput)) {
            System.out.println(" Valid Hex Color!");
        } else {
            System.out.println(" Invalid Hex Color!");
        }

        scanner.close(); // Closing scanner to prevent resource leak
    }
}
