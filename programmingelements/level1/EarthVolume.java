/*
Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____
*/

// Class to compute volume of Earth
class EarthVolume {

    public static void main(String[] args) {

        // Declare constants
        double radiusKm = 6378;
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to miles³ (1 mile = 1.6 km)
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        // Display result
        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
