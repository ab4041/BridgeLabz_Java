/*
Question:
Write a program to check if a number is divisible by 5.

I/P => number
O/P => Is the number ___ divisible by 5? ___
*/

import java.util.Scanner;

// Class to check divisibility by 5
class DivisibleByFive {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Read number from user
        int number = input.nextInt();

        // Check divisibility using modulus operator
        boolean isDivisible = (number % 5 == 0);

        // Display result
        System.out.println(
            "Is the number " + number + " divisible by 5? " + isDivisible
        );

        // Close Scanner
        input.close();
    }
}
