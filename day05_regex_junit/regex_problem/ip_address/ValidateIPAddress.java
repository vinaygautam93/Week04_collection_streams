package com.day05_regex_junit.regex_problem.ip_address;

import java.util.Scanner;
import java.util.regex.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for an IP address
        System.out.println("Enter an IP Address: ");
        String ip = scanner.nextLine();

        // Regex for IPv4 validation (0-255 in four groups)
        String regex =
                "^((25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";

        boolean isValid = ip.matches(regex);

        // Print whether it's valid or not
        System.out.println("Valid IP Address: " + isValid);

        scanner.close();
    }
}
