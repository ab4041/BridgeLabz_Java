/*
Question:
Create a program to find all the multiples of a number taken as user input below 100.

Hint:
- Get input number
- Check if number is positive and less than 100
- Run a for loop backward from 100 to 1
- If i is divisible by number, print i
*/

import java.util.Scanner;

// Class to print multiples of a number below 100 using for loop
class MultiplesBelowHundredForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        int number = input.nextInt();

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100");
        } else {

            // Loop from 100 to 1
            for (int i = 100; i >= 1; i--) {

                // Check divisibility
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
