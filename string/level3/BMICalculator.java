/*
Question:
Find BMI of 10 team members and display Height, Weight, BMI and Status.

Hint:
- Store height(cm) and weight(kg) in 2D array
- Convert cm to meters
- BMI = weight / (height * height)
*/

import java.util.Scanner;

class BMICalculator {

    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        if (bmi < 25) return "Normal";
        if (bmi < 30) return "Overweight";
        return "Obese";
    }

    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightMeters = data[i][1] / 100;
            double bmi = weight / (heightMeters * heightMeters);

            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = getBMIStatus(bmi);
        }
        return result;
    }

    public static void display(String[][] table) {
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");
        for (String[] row : table) {
            System.out.println(row[0] + "\t\t" + row[1] + "\t" + row[2] + "\t" + row[3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }

        display(calculateBMI(data));
        sc.close();
    }
}
