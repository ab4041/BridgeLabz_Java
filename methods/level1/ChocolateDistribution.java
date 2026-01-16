/*
Question:
Create a program to divide N chocolates among M children.

Hint =>
Use quotient and remainder logic
*/

import java.util.Scanner;

class ChocolateDistribution {

    // Method to calculate distribution
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates / children, chocolates % children};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int chocolates = input.nextInt();
        int children = input.nextInt();

        // Calling method
        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);

        input.close();
    }
}
