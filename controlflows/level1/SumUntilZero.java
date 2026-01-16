/*
Question:
Write a program to find sum until the user enters 0.
*/

import java.util.Scanner;

// Class to compute sum until zero
class SumUntilZero {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0.0;
        double value;

        // Loop until user enters zero
        while ((value = input.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("The total sum is " + total);

        input.close();
    }
}
