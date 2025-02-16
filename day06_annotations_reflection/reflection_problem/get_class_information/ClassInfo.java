package com.day06_annotations_reflection.reflection_problem.get_class_Information;

import java.lang.reflect.*;

// Program to get class information using Reflection
public class ClassInfo {
    public static void main(String[] args) throws ClassNotFoundException {
        // Accept class name from user (for demo, using "java.util.ArrayList")
        String className = "java.util.ArrayList";
        Class<?> clazz = Class.forName(className);

        // Display class name
        System.out.println("Class: " + clazz.getName());

        // Display constructors
        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        // Display fields
        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        // Display methods
        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
