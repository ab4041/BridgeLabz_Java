import java.util.regex.Pattern;

/*
Problem:
Validate a username with following rules:
- Starts with a letter
- Contains only letters, digits, underscores
- Length between 5 to 15 characters
*/

public class UsernameValidator {

    public static boolean isValidUsername(String username) {
        String regex = "^[A-Za-z][A-Za-z0-9_]{4,14}$";
        return Pattern.matches(regex, username);
    }

    public static void main(String[] args) {
        System.out.println(isValidUsername("user_123")); // true
        System.out.println(isValidUsername("123user"));  // false
    }
}
