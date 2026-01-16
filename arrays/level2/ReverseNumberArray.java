/*
Question:
Reverse a number using array.
*/

import java.util.Scanner;

// Class to reverse a number
class ReverseNumberArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int[] reversed = new int[count];

        // Store digits
        for (int i = 0; i < count; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        // Reverse array
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[count - 1 - i];
        }

        // Display reversed number
        for (int i = 0; i < count; i++) {
            System.out.print(reversed[i]);
        }

        input.close();
    }
}
