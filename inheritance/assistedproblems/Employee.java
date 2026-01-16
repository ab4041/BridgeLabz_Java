/*
Assisted Problem: Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
1) Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
2) Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails(); // reuse base class display
        System.out.println("Role: Manager");
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer");
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int internshipDurationMonths;

    Intern(String name, int id, double salary, int internshipDurationMonths) {
        super(name, id, salary);
        this.internshipDurationMonths = internshipDurationMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern");
        System.out.println("Internship Duration (Months): " + internshipDurationMonths);
    }
}

public class EmployeeSystemDemo {
    public static void main(String[] args) {
        Employee e1 = new Manager("Varun", 101, 80000, 8);
        Employee e2 = new Developer("Arjun", 102, 65000, "Java");
        Employee e3 = new Intern("Meena", 103, 15000, 6);

        e1.displayDetails();
        System.out.println("------------");
        e2.displayDetails();
        System.out.println("------------");
        e3.displayDetails();
    }
}
