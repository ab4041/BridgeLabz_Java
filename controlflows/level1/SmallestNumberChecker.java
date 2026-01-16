/*
Question:
Write a program to check if the first number is the smallest of three numbers.

I/P => number1, number2, number3
O/P => Is the first number the smallest? ___
*/

import java.util.Scanner;

// Class to check smallest number
class SmallestNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read three numbers
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check if first number is smallest
        boolean isSmallest = (number1 < number2) && (number1 < number3);

        // Print result
        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
