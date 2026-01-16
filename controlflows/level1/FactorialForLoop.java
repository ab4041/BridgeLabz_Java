/*
Question:
Rewrite program 14 using for loop.
*/

import java.util.Scanner;

// Class to calculate factorial using for loop
class FactorialForLoop {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Read the number
        int number = input.nextInt();

        // Check if the number is a natural number
        if (number >= 1) {

            // Variable to store factorial result
            int factorial = 1;

            // For loop to calculate factorial
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Print the result
            System.out.println("The factorial of " + number + " is " + factorial);

        } else {
            // If number is not natural
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close scanner
        input.close();
    }
}
