/*
Program to Compute Area of a Circle
Problem Statement:
Create a Circle class with an attribute radius.
Add methods to calculate and display area and circumference.
*/

class Circle {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public void displayResults() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7);
        circle.displayResults();
    }
}
