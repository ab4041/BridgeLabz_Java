/*
Question:
Write a program to find the distance in yards and miles
for the distance provided by the user in feet.

Hint:
1 yard = 3 feet
1 mile = 1760 yards

I/P => distanceInFeet
O/P => The distance in yards is ___ while the distance in miles is ___
*/

import java.util.Scanner;

// Class to convert distance
class DistanceConversion {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read distance in feet
        double distanceInFeet = input.nextDouble();

        // Convert to yards and miles
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        // Display output
        System.out.println(
            "The distance in yards is " + distanceInYards +
            " while the distance in miles is " + distanceInMiles
        );

        input.close();
    }
}
