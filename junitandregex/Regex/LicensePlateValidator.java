import java.util.regex.Pattern;

/*
Problem:
License plate format:
- Two uppercase letters followed by four digits
Example: AB1234
*/

public class LicensePlateValidator {

    public static boolean isValidPlate(String plate) {
        return Pattern.matches("^[A-Z]{2}[0-9]{4}$", plate);
    }

    public static void main(String[] args) {
        System.out.println(isValidPlate("AB1234")); // true
        System.out.println(isValidPlate("A12345")); // false
    }
}
