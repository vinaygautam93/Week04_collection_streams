package com.day04_exceptions.throw_vs_throws;

import java.util.Scanner;

public class InterestCalculator {
    // Method to calculate interest, but it can throw an exception
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        // Validate inputs
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive!");
        }

        // Calculate simple interest
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for amount, rate, and years
            System.out.print("Enter principal amount: ");
            double amount = scanner.nextDouble();

            System.out.print("Enter interest rate: ");
            double rate = scanner.nextDouble();

            System.out.print("Enter number of years: ");
            int years = scanner.nextInt();

            // Call the method, which may throw an exception
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated Interest: " + interest);
        } catch (IllegalArgumentException e) {
            // Handle the invalid input case
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
