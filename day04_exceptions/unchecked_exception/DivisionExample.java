package com.day04_exceptions.unchecked_exception;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionExample {
    public static void main(String[] args) {
        // Create a Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for two numbers
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            // Perform division (risky part)
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // This catches division by zero
            System.out.println("Cannot divide by zero! Please enter a valid denominator.");
        } catch (InputMismatchException e) {
            // This catches non-numeric input
            System.out.println("Invalid input! Please enter numbers only.");
        } finally {
            // Close the scanner to free up resources
            scanner.close();
        }
    }
}
