package com.day06_annotations_reflection.reflection_problem.retrieve_annotations;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
    String name();
}

// Applying annotation to a class
@Author(name = "Vinay")
class SampleClass {}

// Program to retrieve annotation details
public class AnnotationRetriever {
    public static void main(String[] args) {
        Class<SampleClass> clazz = SampleClass.class;

        // Check if annotation is present
        if (clazz.isAnnotationPresent(Author.class)) {
            Author author = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + author.name());
        }
    }
}
