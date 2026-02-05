import java.util.regex.Pattern;

/*
Problem:
Validate hex color code:
- Starts with #
- Followed by 6 hexadecimal characters
*/

public class HexColorValidator {

    public static boolean isValidHex(String color) {
        return Pattern.matches("^#[0-9a-fA-F]{6}$", color);
    }

    public static void main(String[] args) {
        System.out.println(isValidHex("#FFA500")); // true
        System.out.println(isValidHex("#123"));    // false
    }
}
