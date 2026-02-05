/*
Problem Statement: Multi-Level University Course Management System

Concepts:
Generic Classes, Wildcards, Bounded Type Parameters

Objective:
Manage different types of university courses dynamically.
*/

import java.util.*;

abstract class CourseType {
    abstract String getEvaluationType();
}

class ExamCourse extends CourseType {
    String getEvaluationType() {
        return "Exam-Based Course";
    }
}

class AssignmentCourse extends CourseType {
    String getEvaluationType() {
        return "Assignment-Based Course";
    }
}

class ResearchCourse extends CourseType {
    String getEvaluationType() {
        return "Research-Based Course";
    }
}

class Course<T extends CourseType> {
    private final List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public List<T> getCourses() {
        return courses;
    }
}

public class UniversityCourseManagementSystem {

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getEvaluationType());
        }
    }

    public static void main(String[] args) {
        Course<ExamCourse> examCourses = new Course<>();
        examCourses.addCourse(new ExamCourse());

        Course<ResearchCourse> researchCourses = new Course<>();
        researchCourses.addCourse(new ResearchCourse());

        displayCourses(examCourses.getCourses());
        displayCourses(researchCourses.getCourses());
    }
}
