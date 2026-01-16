/*
Question:
Rewrite the program to find all the multiples of a number below 100 using while loop.

Hint:
- Get input number
- Check if number is positive and less than 100
- Initialize counter = 100
- Use while loop till counter > 0
- If counter is divisible by number, print it
*/

import java.util.Scanner;

// Class to print multiples using while loop
class MultiplesBelowHundredWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        int number = input.nextInt();
        int counter = 100;

        // Validate input
        if (number <= 0 || number >= 100) {
            System.out.println("Enter a positive number less than 100");
        } else {

            // While loop
            while (counter >= 1) {

                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }

        input.close();
    }
}
