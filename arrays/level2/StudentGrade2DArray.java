/*
Question:
Rewrite student marks program using 2D array.
*/

import java.util.Scanner;

// Class to calculate grades using 2D array
class StudentGrade2DArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        double[][] marks = new double[students][3];
        double[] percentage = new double[students];
        String[] grade = new String[students];

        for (int i = 0; i < students; i++) {

            for (int j = 0; j < 3; j++) {
                marks[i][j] = input.nextDouble();
                if (marks[i][j] < 0) {
                    System.err.println("Invalid marks. Enter again.");
                    i--;
                    break;
                }
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 80) grade[i] = "A";
            else if (percentage[i] >= 70) grade[i] = "B";
            else if (percentage[i] >= 60) grade[i] = "C";
            else if (percentage[i] >= 50) grade[i] = "D";
            else if (percentage[i] >= 40) grade[i] = "E";
            else grade[i] = "R";
        }

        for (int i = 0; i < students; i++) {
            System.out.println("Percentage: " + percentage[i] +
                               " Grade: " + grade[i]);
        }

        input.close();
    }
}
