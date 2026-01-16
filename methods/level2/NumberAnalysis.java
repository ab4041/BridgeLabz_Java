/*
Question:
Write a program to take user input for 5 numbers and check whether a number is
positive or negative. Further for positive numbers check if the number is even or odd.
Finally compare the first and last elements of the array
*/

import java.util.Scanner;

class NumberAnalysis {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            if (isPositive(numbers[i])) {
                System.out.println(isEven(numbers[i]) ? "Positive Even" : "Positive Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        System.out.println("Comparison Result: " + result);

        input.close();
    }
}
