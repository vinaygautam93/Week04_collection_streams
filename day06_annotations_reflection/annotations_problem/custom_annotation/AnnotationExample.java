package com.day06_annotations_reflection.annotations_problem.custom_annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Define a custom annotation with priority and assignedTo fields
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TaskInfo {
    String priority();
    String assignedTo();
}

// Apply annotation to a method
class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Vinay")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}

// Retrieve annotation details using Reflection
public class AnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");
        TaskInfo info = method.getAnnotation(TaskInfo.class);
        System.out.println("Priority: " + info.priority());
        System.out.println("Assigned To: " + info.assignedTo());
    }
}
