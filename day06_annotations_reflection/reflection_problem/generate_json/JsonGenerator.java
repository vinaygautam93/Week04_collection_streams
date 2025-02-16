package com.day06_annotations_reflection.reflection_problem.generate_json;

import java.lang.reflect.*;

// Simple User class with fields
class User {
    public String role;
    public int age;
}

// Convert object to JSON-like string
public class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        Class<?> clazz = obj.getClass();
        StringBuilder json = new StringBuilder("{");

        for (Field field : clazz.getDeclaredFields()) {
            field.setAccessible(true);
            json.append("\"").append(field.getName()).append("\":\"").append(field.get(obj)).append("\", ");
        }
        return json.substring(0, json.length() - 2) + "}"; // Remove trailing comma
    }

    public static void main(String[] args) throws Exception {
        // Creating a User object
        User user = new User();
        user.role = "Admin";  // Assigning role
        user.age = 24;        // Assigning age

        // Converting User object to JSON format
        System.out.println("JSON: " + toJson(user));
    }
}
