package com.day04_exceptions.finally_block_execution;

import java.util.Scanner;

public class DivisionWithFinally {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask user for two numbers
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();

            // Perform division
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch division by zero
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            // This block will always execute
            System.out.println("Operation completed.");
            scanner.close();
        }
    }
}
