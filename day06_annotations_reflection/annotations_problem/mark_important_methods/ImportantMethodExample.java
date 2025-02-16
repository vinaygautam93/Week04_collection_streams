package com.day06_annotations_reflection.annotations_problem.mark_important_methods;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define a custom annotation with an optional level parameter
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
    String level() default "HIGH";
}

// Applying annotation to important methods
class Software {
    @ImportantMethod(level = "CRITICAL")
    public void coreFunction() {
        System.out.println("Executing critical function...");
    }

    @ImportantMethod
    public void secondaryFunction() {
        System.out.println("Executing important function...");
    }
}

// Retrieve and print annotated methods
public class ImportantMethodExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Software.class.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + ", Level: " + annotation.level());
            }
        }
    }
}
