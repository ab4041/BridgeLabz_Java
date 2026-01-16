/*
Question:
Write a program to calculate trigonometric functions for a given angle.

Hint =>
Convert degree to radians and use Math.sin, Math.cos, Math.tan
*/

import java.util.Scanner;

class TrigonometricFunctions {

    // Method to calculate trigonometric values
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double angle = input.nextDouble();

        // Calling method
        double[] result = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + result[0]);
        System.out.println("Cosine: " + result[1]);
        System.out.println("Tangent: " + result[2]);

        input.close();
    }
}
