import java.util.regex.Pattern;

/*
Problem:
Validate SSN format: XXX-XX-XXXX
*/

public class SSNValidator {

    public static boolean isValidSSN(String ssn) {
        return Pattern.matches("^\\d{3}-\\d{2}-\\d{4}$", ssn);
    }

    public static void main(String[] args) {
        System.out.println(isValidSSN("123-45-6789")); // true
        System.out.println(isValidSSN("123456789"));   // false
    }
}
