/*
Question:
Create a program to check if a number is a Harshad Number.

Hint:
- Number divisible by sum of its digits
*/

import java.util.Scanner;

// Class to check Harshad number
class HarshadNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;
        int sum = 0;

        // Sum of digits
        while (temp != 0) {
            sum += temp % 10;
            temp = temp / 10;
        }

        // Check Harshad condition
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        input.close();
    }
}
