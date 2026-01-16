/*
Question:
Write a program to check whether a number is positive, negative, or zero.

Hint =>
Return:
1  -> Positive
-1 -> Negative
0  -> Zero
*/

import java.util.Scanner;

class NumberCheck {

    // Method to check number
    public static int checkNumber(int number) {
        if (number > 0)
            return 1;
        else if (number < 0)
            return -1;
        else
            return 0;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        // Calling method
        int result = checkNumber(number);

        System.out.println("Result: " + result);

        input.close();
    }
}
