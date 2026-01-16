/*
Problem Statement:
Course class with instance variables and static instituteName.
*/

class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "SRM";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println(courseName + " | " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }
}
