/*
1. Employee Management System
Description: Build an employee management system with the following requirements:
- Use an abstract class Employee with fields like employeeId, name, and baseSalary.
- Provide an abstract method calculateSalary() and a concrete method displayDetails().
- Create two subclasses: FullTimeEmployee and PartTimeEmployee, implementing calculateSalary() based on work hours or fixed salary.
- Use encapsulation to restrict direct access to fields and provide getter and setter methods.
- Create an interface Department with methods like assignDepartment() and getDepartmentDetails().
- Ensure polymorphism by processing a list of employees and displaying their details using the Employee reference.
*/

import java.util.*;

interface Department {
    void assignDepartment(String deptName);
    String getDepartmentDetails();
}

abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String departmentName;

    public Employee(String employeeId, String name, double baseSalary) {
        setEmployeeId(employeeId);
        setName(name);
        setBaseSalary(baseSalary);
    }

    // ✅ Encapsulation (Getters + Setters with validation)
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.trim().isEmpty())
            throw new IllegalArgumentException("Employee ID cannot be empty");
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be empty");
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) throw new IllegalArgumentException("Base salary cannot be negative");
        this.baseSalary = baseSalary;
    }

    // ✅ Interface methods
    @Override
    public void assignDepartment(String deptName) {
        if (deptName == null || deptName.trim().isEmpty())
            throw new IllegalArgumentException("Department cannot be empty");
        this.departmentName = deptName;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + departmentName;
    }

    // ✅ Polymorphism: implemented differently in child classes
    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId +
                " | Name: " + name +
                " | Salary: " + calculateSalary() +
                " | " + getDepartmentDetails());
    }
}

class FullTimeEmployee extends Employee {
    private double fixedAllowance;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, double fixedAllowance) {
        super(employeeId, name, baseSalary);
        this.fixedAllowance = fixedAllowance;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + fixedAllowance;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int hoursWorked, double ratePerHour) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * ratePerHour);
    }
}

public class Main1_EmployeeManagement {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new FullTimeEmployee("E101", "Varun", 30000, 5000);
        e1.assignDepartment("IT");

        Employee e2 = new PartTimeEmployee("E102", "Rahul", 5000, 60, 250);
        e2.assignDepartment("Support");

        employees.add(e1);
        employees.add(e2);

        System.out.println("---- Employee Details (Polymorphism) ----");
        for (Employee e : employees) {
            e.displayDetails();
        }
    }
}
