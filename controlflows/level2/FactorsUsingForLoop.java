/*
Question:
Create a program to find the factors of a number using for loop.

Hint:
- Take positive integer input
- Loop from 1 to number
- Print i if number is divisible by i
*/

import java.util.Scanner;

// Class to find factors using for loop
class FactorsUsingForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Enter a positive integer");
        } else {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
