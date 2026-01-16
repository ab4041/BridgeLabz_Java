/*
Hierarchical Inheritance - Sample Problem 2: School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, and Teacher, Student, and Staff are subclasses.
Tasks:
1) Define a superclass Person with common attributes like name and age.
2) Define subclasses Teacher, Student, and Staff with specific attributes (e.g., subject for Teacher and grade for Student).
3) Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school, each with shared and unique characteristics.
*/

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println(name + " is a Teacher who teaches " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println(name + " is a Student in grade " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println(name + " is a Staff member in " + department + " department");
    }
}

public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Ravi", 35, "Mathematics");
        Student s = new Student("Varun", 21, "Final Year");
        Staff st = new Staff("Suresh", 40, "Administration");

        t.displayRole();
        s.displayRole();
        st.displayRole();
    }
}
