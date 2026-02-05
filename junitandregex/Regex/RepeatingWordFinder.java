import java.util.regex.*;

/*
Problem:
Find repeating words in a sentence
*/

public class RepeatingWordFinder {

    public static void main(String[] args) {

        String text = "This is is a repeated repeated word test";
        Matcher matcher = Pattern.compile("\\b(\\w+)\\b\\s+\\1\\b").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
