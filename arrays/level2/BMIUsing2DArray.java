/*
Question:
Rewrite BMI program using 2D array.
*/

import java.util.Scanner;

// Class to calculate BMI using 2D array
class BMIUsing2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        double[][] personData = new double[number][3];
        String[] status = new String[number];

        for (int i = 0; i < number; i++) {

            personData[i][0] = input.nextDouble(); // weight
            personData[i][1] = input.nextDouble(); // height

            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.err.println("Invalid input. Enter again.");
                i--;
                continue;
            }

            double heightMeter = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightMeter * heightMeter);

            if (personData[i][2] <= 18.4) {
                status[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                status[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Height: " + personData[i][1] +
                               " Weight: " + personData[i][0] +
                               " BMI: " + personData[i][2] +
                               " Status: " + status[i]);
        }

        input.close();
    }
}
