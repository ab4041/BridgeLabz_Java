/*
Question:
Find the mean height of football players.

Hint:
- Mean = sum / number of players
*/

import java.util.Scanner;

// Class to calculate mean height
class MeanHeightCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] heights = new double[11];
        double sum = 0.0;

        // Input heights
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        double meanHeight = sum / heights.length;

        System.out.println("Mean Height: " + meanHeight);

        input.close();
    }
}
