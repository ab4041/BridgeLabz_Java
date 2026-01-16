/*
Question:
Write a program to check whether a number is positive, negative, or zero.
*/

import java.util.Scanner;

// Class to check number type
class NumberTypeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read number
        int number = input.nextInt();

        // Check conditions
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        input.close();
    }
}
