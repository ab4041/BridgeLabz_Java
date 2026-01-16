/*
Question:
Rewrite sum program using break when input is zero or negative.
*/

import java.util.Scanner;

// Class using break statement
class SumUntilBreak {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;

        while (true) {

            double value = input.nextDouble();

            if (value <= 0) {
                break;
            }

            total += value;
        }

        System.out.println("The total sum is " + total);
        input.close();
    }
}
