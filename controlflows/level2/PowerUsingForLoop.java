/*
Question:
Create a program to find the power of a number.

Hint:
- Take integer input for number and power
- Check for positive integers
- Initialize result = 1
- Run for loop from 1 to power
- Multiply result by number in each iteration
*/

import java.util.Scanner;

// Class to calculate power using for loop
class PowerUsingForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take inputs
        int number = input.nextInt();
        int power = input.nextInt();

        // Initialize result
        int result = 1;

        // Validate inputs
        if (number < 0 || power < 0) {
            System.out.println("Enter positive integers only");
        } else {

            // Calculate power
            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            // Print result
            System.out.println("Result: " + result);
        }

        input.close();
    }
}
