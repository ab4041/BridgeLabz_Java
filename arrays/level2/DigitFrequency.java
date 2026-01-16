/*
Question:
Find frequency of each digit in a number using array.
*/

import java.util.Scanner;

// Class to find digit frequency
class DigitFrequency {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int temp = number;

        int[] frequency = new int[10];

        // Count frequency
        while (temp != 0) {
            int digit = temp % 10;
            frequency[digit]++;
            temp /= 10;
        }

        // Display frequency
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }

        input.close();
    }
}
