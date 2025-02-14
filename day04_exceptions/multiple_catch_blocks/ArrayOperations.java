package com.day04_exceptions.multiple_catch_blocks;

public class ArrayOperations {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {10, 20, 30, 40};

        // Define an invalid index
        int index = 5; // Out of bounds

        try {
            // Try to access the array element
            System.out.println("Value at index " + index + ": " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch when index is out of range
            System.out.println("Invalid index! The array size is " + numbers.length);
        } catch (NullPointerException e) {
            // Catch if the array is null
            System.out.println("Array is not initialized!");
        }
    }
}
