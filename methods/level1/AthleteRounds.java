/*
Question:
An athlete runs in a triangular park with sides provided as input by the user.
If the athlete wants to complete a 5 km run, how many rounds are required?

Hint =>
Perimeter = sum of all sides
Rounds = totalDistance / perimeter

Steps:
1. Take input for 3 sides
2. Calculate perimeter
3. Calculate number of rounds
*/

import java.util.Scanner;

class AthleteRounds {

    // Method to calculate rounds
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000; // 5 km in meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Calling method
        double rounds = calculateRounds(side1, side2, side3);

        // Display result
        System.out.println("Number of rounds required: " + rounds);

        input.close();
    }
}
