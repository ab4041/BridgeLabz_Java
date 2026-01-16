/*
Question:
An organization took up the exercise to find the Body Mass Index (BMI)
of all the persons in the team of 10 members.
*/

import java.util.Scanner;

class BMICalculator {

    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] persons = new double[10][3];

        for (int i = 0; i < 10; i++) {
            persons[i][0] = input.nextDouble(); // weight
            persons[i][1] = input.nextDouble(); // height
        }

        calculateBMI(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println("BMI: " + persons[i][2] +
                    " Status: " + getBMIStatus(persons[i][2]));
        }

        input.close();
    }
}
