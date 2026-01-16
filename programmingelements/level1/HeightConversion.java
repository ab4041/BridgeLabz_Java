/*
Write a program that takes your height in centimeters and converts it into feet and inches
Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
I/P => height
O/P => Your Height in cm is ___ while in feet is ___ and inches is ___
*/

import java.util.Scanner;

// Class to convert height from cm to feet and inches
class HeightConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take height in cm
        double heightCm = input.nextDouble();

        // Convert cm to inches
        double totalInches = heightCm / 2.54;

        // Convert inches to feet and remaining inches
        int feet = (int) (totalInches / 12);
        double inches = totalInches % 12;

        // Display result
        System.out.println(
            "Your Height in cm is " + heightCm +
            " while in feet is " + feet +
            " and inches is " + inches
        );

        input.close();
    }
}
