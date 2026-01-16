/*
Question:
Create a program to check if a number is an Abundant Number.

Hint:
- Sum of divisors greater than the number
*/

import java.util.Scanner;

// Class to check Abundant number
class AbundantNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int sum = 0;

        // Find sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Check abundant condition
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        input.close();
    }
}
