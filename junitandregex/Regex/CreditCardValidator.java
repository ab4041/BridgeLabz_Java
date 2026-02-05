import java.util.regex.Pattern;

/*
Problem:
Validate Visa and MasterCard numbers
*/

public class CreditCardValidator {

    public static boolean isValidCard(String card) {
        return Pattern.matches("^4\\d{15}$|^5\\d{15}$", card);
    }
}
