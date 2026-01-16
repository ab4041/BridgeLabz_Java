/*
Program to Display Employee Details
Problem Statement:
Write a program to create an Employee class with attributes name, id, and salary.
Add a method to display the details.
*/

class Employee {
    private String name;
    private int id;
    private double salary;

    // Constructor
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: ₹" + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Rahul", 101, 50000);
        emp.displayDetails();
    }
}
