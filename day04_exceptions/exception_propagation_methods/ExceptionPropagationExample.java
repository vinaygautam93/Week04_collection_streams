package com.day04_exceptions.exception_propagation_methods;

public class ExceptionPropagationExample {
    // Method that causes an exception
    public static void method1() {
        int result = 10 / 0; // This will cause ArithmeticException
    }

    // Method that calls method1()
    public static void method2() {
        method1(); // Exception propagates here
    }

    public static void main(String[] args) {
        try {
            method2(); // Exception propagates to main()
        } catch (ArithmeticException e) {
            // Handle the exception in main
            System.out.println("Handled exception in main: " + e.getMessage());
        }
    }
}
