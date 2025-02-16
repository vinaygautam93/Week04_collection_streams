package com.day06_annotations_reflection.reflection_problem.access_private_field;

import java.lang.reflect.*;

// Person class with a private field
class Person {
    private int age = 25;
}

// Program to modify and access a private field using Reflection
public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> clazz = person.getClass();

        // Access the private field
        Field field = clazz.getDeclaredField("age");
        field.setAccessible(true);

        // Retrieve the value
        System.out.println("Original Age: " + field.get(person));

        // Modify the value
        field.set(person, 30);
        System.out.println("Modified Age: " + field.get(person));
    }
}
