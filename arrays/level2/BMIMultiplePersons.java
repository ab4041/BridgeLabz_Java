/*
Question:
Find BMI of multiple persons using arrays.
*/

import java.util.Scanner;

// Class to calculate BMI for multiple persons
class BMIMultiplePersons {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numberOfPersons = input.nextInt();

        double[] weight = new double[numberOfPersons];
        double[] height = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] status = new String[numberOfPersons];

        for (int i = 0; i < numberOfPersons; i++) {

            weight[i] = input.nextDouble();
            height[i] = input.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.err.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            double heightMeter = height[i] / 100;
            bmi[i] = weight[i] / (heightMeter * heightMeter);

            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Display results
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Height: " + height[i] +
                               " Weight: " + weight[i] +
                               " BMI: " + bmi[i] +
                               " Status: " + status[i]);
        }

        input.close();
    }
}
