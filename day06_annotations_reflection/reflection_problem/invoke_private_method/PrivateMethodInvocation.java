package com.day06_annotations_reflection.reflection_problem.Invoke_private_method;

import java.lang.reflect.*;

// Calculator class with a private method
class Calculator {
    private int multiply(int a, int b) {
        return a * b;
    }
}

// Program to invoke a private method using Reflection
public class PrivateMethodInvocation {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Class<?> clazz = calculator.getClass();

        // Access the private method
        Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        // Invoke the method
        int result = (int) method.invoke(calculator, 5, 6);
        System.out.println("Multiplication Result: " + result);
    }
}
