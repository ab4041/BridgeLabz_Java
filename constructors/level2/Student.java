/*
Problem Statement:
Student class with public, protected and private members.
*/

class Student {
    public int rollNumber;
    protected String name;
    private double cgpa;

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public double getCgpa() {
        return cgpa;
    }
}

class PostgraduateStudent extends Student {
    public void display() {
        System.out.println(rollNumber + " " + name);
    }
}
