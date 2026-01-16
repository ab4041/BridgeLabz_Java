/*
Question:
Create a program to find the multiplication table of a number entered by the user from 6 to 9.

Hint:
- Take integer input and store it in variable number
- Use a for loop from 6 to 9
- Print in the format: number * i = result
*/

import java.util.Scanner;

// Class to print multiplication table from 6 to 9
class MultiplicationTable {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take number input
        int number = input.nextInt();

        // Loop from 6 to 9
        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

        // Close scanner
        input.close();
    }
}
