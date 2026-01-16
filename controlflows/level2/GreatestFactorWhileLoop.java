/*
Question:
Rewrite the program to print the greatest factor of a number beside itself using a while loop.

Hint:
- Get integer input and store in number
- Initialize greatestFactor to 1
- Set counter = number - 1
- Run while loop till counter == 1
- If number is divisible by counter, assign and break
- Print the greatestFactor
*/

import java.util.Scanner;

// Class to find the greatest factor using while loop
class GreatestFactorWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input number
        int number = input.nextInt();

        // Initialize variables
        int greatestFactor = 1;
        int counter = number - 1;

        // While loop to find greatest factor
        while (counter >= 1) {

            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Display result
        System.out.println("Greatest factor (beside itself): " + greatestFactor);

        input.close();
    }
}
