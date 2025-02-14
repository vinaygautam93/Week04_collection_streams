package com.day04_exceptions.nested_try_catch_block;

import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {10, 20, 30, 40}; // Example array

        //First try catch block
        try {
            // Ask for index input
            System.out.print("Enter index: ");
            int index = scanner.nextInt();

            try {
                // Try to access the array element
                int value = numbers[index];

                // Ask for a divisor
                System.out.print("Enter divisor: ");
                int divisor = scanner.nextInt();

                // Try to divide the value
                int result = value / divisor;
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                // Catch division by zero
                System.out.println("Cannot divide by zero!" + e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch invalid index
            System.out.println("Invalid array index!" + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
