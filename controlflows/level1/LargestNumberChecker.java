/*
Question:
Write a program to check if the first, second, or third number
is the largest among three numbers.
*/

import java.util.Scanner;

// Class to check largest number
class LargestNumberChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read inputs
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Check largest conditions
        boolean firstLargest = (number1 > number2) && (number1 > number3);
        boolean secondLargest = (number2 > number1) && (number2 > number3);
        boolean thirdLargest = (number3 > number1) && (number3 > number2);

        // Print results
        System.out.println("Is the first number the largest? " + firstLargest);
        System.out.println("Is the second number the largest? " + secondLargest);
        System.out.println("Is the third number the largest? " + thirdLargest);

        input.close();
    }
}
