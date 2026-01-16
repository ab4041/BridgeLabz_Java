/*
Question:
Write a program to find the smallest and largest of three numbers.

Hint =>
Use a single method returning int array
*/

import java.util.Scanner;

class SmallestLargest {

    // Method to find smallest and largest
    public static int[] findSmallestAndLargest(int a, int b, int c) {

        int smallest = Math.min(a, Math.min(b, c));
        int largest = Math.max(a, Math.max(b, c));

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        // Calling method
        int[] result = findSmallestAndLargest(num1, num2, num3);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);

        input.close();
    }
}
