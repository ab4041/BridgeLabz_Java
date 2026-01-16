/*
Question:
Calculate percentage and grade of students.
*/

import java.util.Scanner;

// Class to calculate grades
class StudentGradeArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int students = input.nextInt();

        double[] percentage = new double[students];
        String[] grade = new String[students];

        double[] physics = new double[students];
        double[] chemistry = new double[students];
        double[] maths = new double[students];

        for (int i = 0; i < students; i++) {

            physics[i] = input.nextDouble();
            chemistry[i] = input.nextDouble();
            maths[i] = input.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.err.println("Invalid marks. Enter again.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

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
