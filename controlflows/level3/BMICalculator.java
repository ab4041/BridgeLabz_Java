/*
Question:
Create a program to find the BMI of a person.

Hint:
- BMI = weight / (height * height)
- Convert height from cm to meters
*/

import java.util.Scanner;

// Class to calculate BMI
class BMICalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weight = input.nextDouble();
        double heightCm = input.nextDouble();

        // Convert height to meters
        double heightMeter = heightCm / 100;

        // Calculate BMI
        double bmi = weight / (heightMeter * heightMeter);

        System.out.println("BMI: " + bmi);

        // Determine BMI status
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <= 24.9) {
            System.out.println("Normal");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
