/*
Problem Statement: AI-Driven Resume Screening System

Concepts:
Generic Classes, Generic Methods, Bounded Type Parameters, Wildcards

Objective:
Process resumes for different job roles while maintaining type safety.
*/

import java.util.*;

abstract class JobRole {
    abstract String getRoleName();
}

class SoftwareEngineer extends JobRole {
    String getRoleName() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String getRoleName() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    String getRoleName() {
        return "Product Manager";
    }
}

class Resume<T extends JobRole> {
    private final T role;

    Resume(T role) {
        this.role = role;
    }

    public T getRole() {
        return role;
    }
}

public class AIResumeScreeningSystem {

    public static void screenResumes(List<? extends JobRole> roles) {
        for (JobRole role : roles) {
            System.out.println("Screening resume for: " + role.getRoleName());
        }
    }

    public static void main(String[] args) {
        List<JobRole> roles = List.of(
            new SoftwareEngineer(),
            new DataScientist(),
            new ProductManager()
        );

        screenResumes(roles);
    }
}
