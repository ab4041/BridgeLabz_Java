/*
Question:
Write a program to find the sum of n natural numbers using loop.

Hint =>
Use loop from 1 to n
*/

import java.util.Scanner;

class SumOfNaturalNumbers {

    // Method to calculate sum
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // Calling method
        int result = calculateSum(n);

        System.out.println("Sum of natural numbers: " + result);

        input.close();
    }
}
