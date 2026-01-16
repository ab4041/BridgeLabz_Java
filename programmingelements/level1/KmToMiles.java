/*
Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
*/

// Class to convert kilometers to miles
class KmToMiles {

    public static void main(String[] args) {

        // Declare variables
        double kilometers = 10.8;
        double kmToMileFactor = 1.6;

        // Conversion
        double miles = kilometers / kmToMileFactor;

        // Display result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
