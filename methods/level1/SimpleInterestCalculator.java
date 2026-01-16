/*
Question:
Write a program to input the Principal, Rate, and Time values and calculate Simple Interest.

Hint =>
Simple Interest = Principal * Rate * Time / 100

Steps:
1. Take user input for principal, rate, and time
2. Write a method to calculate simple interest
3. Display the result in proper format
*/

import java.util.Scanner;

class SimpleInterestCalculator {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user inputs
        double principal = input.nextDouble();
        double rate = input.nextDouble();
        double time = input.nextDouble();

        // Calling method
        double interest = calculateSimpleInterest(principal, rate, time);

        // Displaying result
        System.out.println("The Simple Interest is " + interest +
                " for Principal " + principal +
                ", Rate of Interest " + rate +
                " and Time " + time);

        input.close();
    }
}
