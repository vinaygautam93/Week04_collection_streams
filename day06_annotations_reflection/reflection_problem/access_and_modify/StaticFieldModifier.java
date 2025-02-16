package com.day06_annotations_reflection.reflection_problem.access_and_modify;

import java.lang.reflect.*;

// Configuration class with a private static field
class Configuration {
    private static String API_KEY = "OLD_API_KEY";
}

// Program to modify and access a static field using Reflection
public class StaticFieldModifier {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Configuration.class;

        // Access the private static field
        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        // Modify the value
        field.set(null, "NEW_SECRET_KEY");

        // Retrieve modified value
        System.out.println("Updated API Key: " + field.get(null));
    }
}
