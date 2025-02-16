package com.day06_annotations_reflection.reflection_problem.generate_class_diagram;

import java.lang.reflect.*;

// Step 1: Define a sample class
class Sample {
    private int id;
    public String name;

    public void display() {}
    private void calculate() {}
}

// Step 2: Generate a basic class diagram
public class ClassDiagramGenerator {
    public static void main(String[] args) {
        Class<?> clazz = Sample.class;

        // Print class name
        System.out.println("📌 Class: " + clazz.getSimpleName());

        // Print fields
        System.out.println("\n🔹 Fields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println("   - " + Modifier.toString(field.getModifiers()) + " " + field.getType().getSimpleName() + " " + field.getName());
        }

        // Print methods
        System.out.println("\n🔹 Methods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println("   - " + Modifier.toString(method.getModifiers()) + " " + method.getName() + "()");
        }
    }
}
