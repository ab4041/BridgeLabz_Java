/*
Question:
Find the youngest and tallest among Amar, Akbar, and Anthony.
*/

import java.util.Scanner;

// Class to find youngest and tallest friend
class YoungestAndTallestFriend {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int friendCount = 3;

        int[] age = new int[friendCount];
        double[] height = new double[friendCount];

        // Input age and height
        for (int i = 0; i < friendCount; i++) {
            age[i] = input.nextInt();
            height[i] = input.nextDouble();

            if (age[i] <= 0 || height[i] <= 0) {
                System.err.println("Invalid input. Enter again.");
                i--;
            }
        }

        int youngest = age[0];
        double tallest = height[0];

        // Find youngest and tallest
        for (int i = 1; i < friendCount; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }

        System.out.println("Youngest Age: " + youngest);
        System.out.println("Tallest Height: " + tallest);

        input.close();
    }
}
