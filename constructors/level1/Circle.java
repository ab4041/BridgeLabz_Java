/*
Problem Statement:
Write a Circle class with a radius attribute.
Use constructor chaining to initialize radius with default and user-provided values.
*/

class Circle {
    private double radius;

    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);

        System.out.println(c1.area());
        System.out.println(c2.area());
    }
}
