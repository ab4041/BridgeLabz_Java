/*
Question:
Write a program to check if a number is a Prime Number.

Hint:
- Prime numbers are greater than 1
- Use isPrime boolean variable
- Loop from 2 to number - 1
*/

import java.util.Scanner;

// Class to check prime number
class PrimeNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        boolean isPrime = true;

        // Prime check condition
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }

        input.close();
    }
}
