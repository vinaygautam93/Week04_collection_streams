package com.day01_generics.problem03;

import java.util.ArrayList;
import java.util.List;

// Generic Course class restricted to CourseType
class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void showCourseDetails() {
        System.out.println(courseName + " - Type: " + courseType.getTypeName());
    }
}

// Abstract class representing a course type
abstract class CourseType {
    public abstract String getTypeName();
}

// Different types of courses
class ExamCourse extends CourseType {
    @Override
    public String getTypeName() {
        return "Exam-Based Course";
    }
}

class AssignmentCourse extends CourseType {
    @Override
    public String getTypeName() {
        return "Assignment-Based Course";
    }
}

class ResearchCourse extends CourseType {
    @Override
    public String getTypeName() {
        return "Research-Based Course";
    }
}

// Main class for testing
public class UniversityCourseSystem {
    public static void main(String[] args) {
        // Creating different courses
        Course<ExamCourse> mathCourse = new Course<>("Mathematics", new ExamCourse());
        Course<AssignmentCourse> csCourse = new Course<>("Computer Science", new AssignmentCourse());
        Course<ResearchCourse> physicsCourse = new Course<>("Physics Research", new ResearchCourse());

        // Displaying course details
        mathCourse.showCourseDetails();
        csCourse.showCourseDetails();
        physicsCourse.showCourseDetails();
    }
}
