/*
Question:
Write a program to check for a natural number and print the
sum of n natural numbers.

I/P => number
*/

import java.util.Scanner;

// Class to compute sum of natural numbers
class NaturalNumberSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read input number
        int number = input.nextInt();

        // Check for natural number
        if (number >= 1) {

            // Formula-based sum
            int sum = number * (number + 1) / 2;

            System.out.println(
                "The sum of " + number + " natural numbers is " + sum
            );
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }

        input.close();
    }
}
