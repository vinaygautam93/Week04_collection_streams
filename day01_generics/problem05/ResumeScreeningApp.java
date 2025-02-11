package com.day01_generics.problem05;

import java.util.ArrayList;
import java.util.List;

// Generic Resume class restricted to JobRole types
class Resume<T extends JobRole> {
    private String candidateName;
    private T jobRole;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void showResume() {
        System.out.println("Candidate: " + candidateName + " - Applying for: " + jobRole.getRoleName());
    }
}

// Abstract JobRole class for different job types
abstract class JobRole {
    public abstract String getRoleName();
}

// Different job roles
class SoftwareEngineer extends JobRole {
    @Override
    public String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    @Override
    public String getRoleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    @Override
    public String getRoleName() {
        return "Product Manager";
    }
}

// Resume Screening System with a generic method
class ResumeScreeningSystem {
    public static void processResumes(List<? extends Resume<? extends JobRole>> resumes) {
        System.out.println("\nProcessing Resumes for Screening...");
        for (Resume<? extends JobRole> resume : resumes) {
            resume.showResume();
        }
    }
}

// Main class to test the Resume Screening System
public class ResumeScreeningApp {
    public static void main(String[] args) {
        // Creating different resumes
        Resume<SoftwareEngineer> seResume = new Resume<>("Alice Johnson", new SoftwareEngineer());
        Resume<DataScientist> dsResume = new Resume<>("Bob Smith", new DataScientist());
        Resume<ProductManager> pmResume = new Resume<>("Charlie Davis", new ProductManager());

        // Storing resumes in a list
        List<Resume<? extends JobRole>> resumeList = new ArrayList<>();
        resumeList.add(seResume);
        resumeList.add(dsResume);
        resumeList.add(pmResume);

        // Processing resumes
        ResumeScreeningSystem.processResumes(resumeList);
    }
}
