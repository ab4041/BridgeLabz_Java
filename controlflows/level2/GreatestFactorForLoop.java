/*
Question:
Create a program to print the greatest factor of a number beside itself using a loop.

Hint:
- Get an integer input and assign it to the number variable
- Define a greatestFactor variable and initialize it to 1
- Run a for loop from number - 1 till 1
- If the number is perfectly divisible by i, assign i to greatestFactor and break the loop
- Display the greatestFactor
*/

import java.util.Scanner;

// Class to find the greatest factor of a number using for loop
class GreatestFactorForLoop {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input number
        int number = input.nextInt();

        // Initialize greatest factor
        int greatestFactor = 1;

        // Loop from number - 1 down to 1
        for (int i = number - 1; i >= 1; i--) {

            // Check perfect divisibility
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Print the result
        System.out.println("Greatest factor (beside itself): " + greatestFactor);

        // Close scanner
        input.close();
    }
}
