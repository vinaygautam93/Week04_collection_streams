package com.day06_annotations_reflection.reflection_problem.method_execution;

import java.lang.reflect.*;

// Step 1: Create a class with methods to test
class MathOperations {
    void slowMethod() throws InterruptedException {
        Thread.sleep(1000); // Simulating slow operation
        System.out.println("✅ Slow method executed.");
    }

    void fastMethod() {
        System.out.println("✅ Fast method executed.");
    }
}

// Step 2: Implement Reflection-based execution timing
public class ExecutionTimeMeasurement {
    public static void main(String[] args) throws Exception {
        MathOperations obj = new MathOperations();
        Class<?> clazz = obj.getClass();

        // Measure execution time for each method
        for (Method method : clazz.getDeclaredMethods()) {
            long startTime = System.nanoTime(); // Start time
            method.invoke(obj);  // Call method
            long endTime = System.nanoTime();   // End time

            System.out.println("⏳ Execution Time for " + method.getName() + ": "
                    + (endTime - startTime) / 1_000_000.0 + " ms\n");
        }
    }
}
