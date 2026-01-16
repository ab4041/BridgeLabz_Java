/*
Question:
Write a program to calculate wind chill temperature.

Hint =>
Formula:
windChill = 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * windSpeed^0.16
*/

import java.util.Scanner;

class WindChillCalculator {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) +
               (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double temperature = input.nextDouble();
        double windSpeed = input.nextDouble();

        // Calling method
        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("Wind Chill Temperature: " + windChill);

        input.close();
    }
}
