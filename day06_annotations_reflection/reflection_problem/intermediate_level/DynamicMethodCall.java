package com.day06_annotations_reflection.reflection_problem.Intermediate_level;

import java.lang.reflect.*;

// Class with multiple methods
class MathOperations {
    public int add(int a, int b) { return a + b; }
    public int subtract(int a, int b) { return a - b; }
    public int multiply(int a, int b) { return a * b; }
}

// Program to dynamically invoke a method based on user input
public class DynamicMethodCall {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Class<?> clazz = obj.getClass();

        // Method name input (for demo, using "multiply")
        String methodName = "multiply";

        // Get method and invoke it dynamically
        Method method = clazz.getMethod(methodName, int.class, int.class);
        int result = (int) method.invoke(obj, 7, 3);

        System.out.println("Result: " + result);
    }
}
