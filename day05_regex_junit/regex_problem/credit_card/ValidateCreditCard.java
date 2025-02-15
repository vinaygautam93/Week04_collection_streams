package com.day05_regex_junit.regex_problem.credit_card;

import java.util.Scanner;

public class ValidateCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a credit card number
        System.out.println("Enter a Credit Card Number: ");
        String cardNumber = scanner.nextLine();

        // Regex for Visa (16 digits, starts with 4) & MasterCard (starts with 5, 16 digits)
        String regex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";

        boolean isValid = cardNumber.matches(regex);

        System.out.println("Valid Credit Card: " + isValid);

        scanner.close();
    }
}
