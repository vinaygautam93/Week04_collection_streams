package com.day06_annotations_reflection.annotations_problem.role_based_access_control;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define annotation for access control
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

// User roles simulation
class User {
    String role;

    public User(String role) {
        this.role = role;
    }
}

// Service class with restricted access
class SecureService {
    @RoleAllowed("ADMIN")
    public void adminOnlyFunction() {
        System.out.println("Admin access granted!");
    }
}

// Access control verification
public class AccessControlExample {
    public static void main(String[] args) throws Exception {
        User user = new User("USER"); // Change to "ADMIN" to allow access
        Method method = SecureService.class.getMethod("adminOnlyFunction");

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed annotation = method.getAnnotation(RoleAllowed.class);
            if (annotation.value().equals(user.role)) {
                method.invoke(new SecureService());
            } else {
                System.out.println("Access Denied!");
            }
        }
    }
}
