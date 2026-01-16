/*
Question:
Write a program to find the side of the square whose perimeter
you read from the user.

Hint:
Perimeter of Square = 4 * side

I/P => perimeter
O/P => The length of the side is ___ whose perimeter is ___
*/

import java.util.Scanner;

// Class to compute side of a square
class SquareSideCalculation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read perimeter
        double perimeter = input.nextDouble();

        // Calculate side length
        double side = perimeter / 4;

        // Display result
        System.out.println(
            "The length of the side is " + side +
            " whose perimeter is " + perimeter
        );

        input.close();
    }
}
