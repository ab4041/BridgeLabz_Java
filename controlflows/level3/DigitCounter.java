/*
Question:
Create a program to count the number of digits in an integer.

Hint:
- Use a loop
- Increment count for each digit
*/

import java.util.Scanner;

// Class to count digits
class DigitCounter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int count = 0;

        // Count digits
        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits: " + count);

        input.close();
    }
}
