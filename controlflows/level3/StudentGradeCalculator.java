/*
Question:
Write a program to input marks in Physics, Chemistry and Maths.
Compute percentage and calculate grade.

Hint:
- Take marks of 3 subjects
- Calculate average percentage
- Display percentage, grade and remarks
*/

import java.util.Scanner;

// Class to calculate percentage and grade
class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input marks
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();

        // Calculate percentage
        double percentage = (physics + chemistry + maths) / 3;

        // Display percentage
        System.out.println("Percentage: " + percentage);

        // Determine grade
        if (percentage >= 80) {
            System.out.println("Grade: A (Excellent)");
        } else if (percentage >= 70) {
            System.out.println("Grade: B (Very Good)");
        } else if (percentage >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (percentage >= 50) {
            System.out.println("Grade: D (Average)");
        } else if (percentage >= 40) {
            System.out.println("Grade: E (Below Average)");
        } else {
            System.out.println("Grade: R (Remedial)");
        }

        input.close();
    }
}
