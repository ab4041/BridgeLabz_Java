/*
Question:
Write a program that takes the base and height in cm to find the area
of a triangle in square inches and square centimeters.

Hint:
Area of Triangle = 1/2 * base * height
1 inch = 2.54 cm

I/P => base, height
O/P => The Area of the triangle in sq in is ___ and sq cm is ___
*/

import java.util.Scanner;

// Class to compute triangle area
class TriangleArea {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read base and height in cm
        double baseCm = input.nextDouble();
        double heightCm = input.nextDouble();

        // Area in square centimeters
        double areaSqCm = 0.5 * baseCm * heightCm;

        // Convert sq cm to sq inches
        double areaSqInches = areaSqCm / (2.54 * 2.54);

        // Display output
        System.out.println(
            "The Area of the triangle in sq in is " +
            areaSqInches + " and sq cm is " + areaSqCm
        );

        input.close();
    }
}
