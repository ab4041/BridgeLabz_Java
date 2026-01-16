/*
Question:
Find sum of n natural numbers using while loop and formula.
*/

import java.util.Scanner;

// Class to compare sum calculations
class NaturalSumWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        if (n >= 1) {

            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;

            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println(
                "Sum using formula: " + formulaSum +
                ", Sum using while loop: " + loopSum
            );
        } else {
            System.out.println("Not a natural number");
        }

        input.close();
    }
}
