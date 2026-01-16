/*
Question:
Write a program to take two numbers and print their quotient and remainder.

Hint =>
Use / and % operators
*/

import java.util.Scanner;

class QuotientRemainder {

    // Method to find quotient and remainder
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number / divisor, number % divisor};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int divisor = input.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + result[0]);
        System.out.println("Remainder: " + result[1]);

        input.close();
    }
}
