package com.day06_annotations_reflection.annotations_problem.repeatable_annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

// Repeatable annotation definition
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

// Container annotation to hold multiple BugReport annotations
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface BugReports {
    BugReport[] value();
}

// Applying multiple BugReport annotations on a method
class BugTracker {
    @BugReport(description = "Null pointer exception occurs sometimes")
    @BugReport(description = "Performance issue under heavy load")
    public void fixBugs() {
        System.out.println("Fixing reported bugs...");
    }
}

// Retrieve and print all bug reports using Reflection
public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = BugTracker.class.getMethod("fixBugs");
        BugReports reports = method.getAnnotation(BugReports.class);
        for (BugReport report : reports.value()) {
            System.out.println("Bug Report: " + report.description());
        }
    }
}
