/*
Question:
Store numbers until user enters 0 or negative or array is full.
Display numbers and sum.
*/

import java.util.Scanner;

// Class to store numbers and calculate sum
class StoreNumbersAndSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop for input
        while (true) {

            double value = input.nextDouble();

            // Break conditions
            if (value <= 0 || index == numbers.length) {
                break;
            }

            numbers[index++] = value;
        }

        // Calculate sum
        for (int i = 0; i < index; i++) {
            total += numbers[i];
            System.out.println(numbers[i]);
        }

        System.out.println("Total = " + total);

        input.close();
    }
}
