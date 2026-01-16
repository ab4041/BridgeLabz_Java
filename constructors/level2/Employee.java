/*
Problem Statement:
Employee with public, protected and private members.
*/

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    public void display() {
        System.out.println(employeeID + " " + department);
    }
}
