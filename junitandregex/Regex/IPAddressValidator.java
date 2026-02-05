import java.util.regex.Pattern;

/*
Problem:
Validate IPv4 address (0-255)
*/

public class IPAddressValidator {

    public static boolean isValidIP(String ip) {
        String regex =
            "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}" +
            "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        return Pattern.matches(regex, ip);
    }

    public static void main(String[] args) {
        System.out.println(isValidIP("192.168.1.1")); // true
        System.out.println(isValidIP("256.1.1.1"));   // false
    }
}
