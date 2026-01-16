/*
Question:
Write a program to find the sum of n natural numbers using recursive method and
compare the result with the formula n*(n+1)/2.

Hint =>
Take the user input number and check whether it's a Natural number, if not exit
Write a Method to find the sum of n natural numbers using recursion
Write a Method to find the sum using formula
Compare the two results and print the result
*/

import java.util.Scanner;

class NaturalNumberSum {

    public static int recursiveSum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Not a Natural Number");
            return;
        }

        int recursionResult = recursiveSum(n);
        int formulaResult = formulaSum(n);

        System.out.println("Recursive Sum: " + recursionResult);
        System.out.println("Formula Sum: " + formulaResult);

        System.out.println("Both results are equal: " + (recursionResult == formulaResult));

        input.close();
    }
}
