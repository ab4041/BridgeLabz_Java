/*
Question:
Rewrite the program to find the power of a number using a while loop.

Hint:
- Take integer input for number and power
- Initialize result = 1 and counter = 0
- Run while loop till counter == power
- Multiply result by number in each iteration
*/

import java.util.Scanner;

// Class to calculate power using while loop
class PowerUsingWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize variables
        int result = 1;
        int counter = 0;

        // Validate inputs
        if (number < 0 || power < 0) {
            System.out.println("Enter positive integers only");
        } else {

            // While loop to calculate power
            while (counter < power) {
                result = result * number;
                counter++;
            }

            // Print result
            System.out.println("Result: " + result);
        }

        input.close();
    }
}
