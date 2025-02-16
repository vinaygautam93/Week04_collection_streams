package com.day06_annotations_reflection.reflection_problem.dynamically_create_objects;

import java.lang.reflect.*;

// Student class with a default constructor
class Student {
    public void show() {
        System.out.println("Student object created dynamically!");
    }
}

// Program to create an object dynamically using Reflection
public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Student.class;

        // Create an instance dynamically
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Invoke a method on the created object
        Method method = clazz.getMethod("show");
        method.invoke(obj);
    }
}
