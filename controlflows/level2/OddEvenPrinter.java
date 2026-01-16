/*
Question:
Create a program to print odd and even numbers between 1 to the number entered by the user.

Hint:
- Get an integer input from the user and store it in a variable named number
- Check if the number is a natural number
- Use a for loop to iterate from 1 to number
- In each iteration, check if the number is odd or even and print accordingly
*/

import java.util.Scanner;

// Class to print odd and even numbers up to a given number
class OddEvenPrinter {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("Please enter a natural number");
        } else {
            // Loop from 1 to number
            for (int i = 1; i <= number; i++) {

                // Check even or odd
                if (i % 2 == 0) {
                    System.out.println(i + " is Even");
                } else {
                    System.out.println(i + " is Odd");
                }
            }
        }

        // Close scanner
        input.close();
    }
}
