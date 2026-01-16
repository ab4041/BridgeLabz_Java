/*
Question:
Write a program to find factorial using while loop.
*/

import java.util.Scanner;

// Class to compute factorial using while loop
class FactorialWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number >= 1) {

            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is " + factorial);
        } else {
            System.out.println("Invalid input");
        }

        input.close();
    }
}
