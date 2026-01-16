/*
Question:
Extend or Create a UnitConvertor utility class similar to the one shown in the notes
Please define static methods for all the UnitConvertor class methods.
*/

class UnitConvertorUtility {

    public static double convertFarhenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCelsiusToFarhenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kg) {
        return kg * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }
}
