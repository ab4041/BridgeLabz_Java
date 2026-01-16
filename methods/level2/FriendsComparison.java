/*
Question:
Create a program to find the youngest and tallest among Amar, Akbar and Anthony.

Hint =>
Store age and height in arrays
Write separate methods to find youngest and tallest
*/

import java.util.Scanner;

class FriendsComparison {

    public static int findYoungest(int[] ages) {
        int min = ages[0];
        for (int age : ages) {
            if (age < min) min = age;
        }
        return min;
    }

    public static double findTallest(double[] heights) {
        double max = heights[0];
        for (double height : heights) {
            if (height > max) max = height;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            ages[i] = input.nextInt();
            heights[i] = input.nextDouble();
        }

        System.out.println("Youngest Age: " + findYoungest(ages));
        System.out.println("Tallest Height: " + findTallest(heights));

        input.close();
    }
}
