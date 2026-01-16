/*
Question:
Create a program to print multiplication table of a number.

Hint:
- Store results in an integer array
*/

import java.util.Scanner;

// Class to generate multiplication table
class MultiplicationTableArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Validate input
        if (number <= 0) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        int[] table = new int[10];

        // Store multiplication results
        for (int i = 1; i <= table.length; i++) {
            table[i - 1] = number * i;
        }

        // Display table
        for (int i = 1; i <= table.length; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        input.close();
    }
}
