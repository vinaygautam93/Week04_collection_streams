package com.day06_annotations_reflection.reflection_problem.dependency_injection;

import java.lang.annotation.*;
import java.lang.reflect.*;

// Step 1: Create an annotation for Dependency Injection
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Inject {}

// Step 2: Define a service class
class EmailService {
    void sendEmail() {
        System.out.println("📧 Sending email...");
    }
}

// Step 3: Define a class that depends on EmailService
class UserService {
    @Inject
    private EmailService emailService;

    void notifyUser() {
        emailService.sendEmail();
        System.out.println("User notified via email.");
    }
}

// Step 4: Implement the Dependency Injection logic
class DIContainer {
    public static void injectDependencies(Object obj) throws Exception {
        for (Field field : obj.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(Inject.class)) {
                field.setAccessible(true);
                Object dependency = field.getType().getDeclaredConstructor().newInstance();
                field.set(obj, dependency);
            }
        }
    }
}

// Step 5: Test Dependency Injection
public class DependencyInjectionExample {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        DIContainer.injectDependencies(userService);
        userService.notifyUser();
    }
}
