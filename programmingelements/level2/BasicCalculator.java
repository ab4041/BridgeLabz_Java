/*
Question:
Write a program to create a basic calculator for addition, subtraction,
multiplication, and division. The program should ask for two numbers
(floating point) and perform all the operations.

I/P => number1, number2
O/P => The addition, subtraction, multiplication, and division value
       of 2 numbers ___ and ___ is ___, ___, ___, and ___
*/

import java.util.Scanner;

// Class to perform basic arithmetic calculations
class BasicCalculator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read two floating point numbers
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Display results
        System.out.println(
            "The addition, subtraction, multiplication, and division value of 2 numbers "
            + number1 + " and " + number2 + " is "
            + addition + ", " + subtraction + ", "
            + multiplication + ", and " + division
        );

        input.close();
    }
}
