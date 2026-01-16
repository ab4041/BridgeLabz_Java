/*
Question:
Write a program to take 2 numbers and print their quotient and remainder.

Hint:
Use / for quotient and % for remainder

I/P => number1, number2
O/P => The Quotient is ___ and Reminder is ___ of two number ___ and ___
*/

import java.util.Scanner;

// Class to compute quotient and remainder
class QuotientRemainder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read integers
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Calculate quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Display output
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2
        );

        input.close();
    }
}
