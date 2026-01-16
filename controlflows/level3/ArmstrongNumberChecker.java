/*
Question:
Create a program to check if a number is an Armstrong Number.

Hint:
- Sum of cubes of digits equals the original number
*/

import java.util.Scanner;

// Class to check Armstrong number
class ArmstrongNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int originalNumber = number;
        int sum = 0;

        // Extract digits and calculate cube sum
        while (number != 0) {
            int digit = number % 10;
            sum += digit * digit * digit;
            number = number / 10;
        }

        // Check Armstrong condition
        if (sum == originalNumber) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }

        input.close();
    }
}
