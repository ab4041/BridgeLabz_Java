import java.util.regex.*;

/*
Problem:
Extract URLs from text
*/

public class URLExtractor {

    public static void main(String[] args) {

        String text = "Visit https://www.google.com and http://example.org";
        Matcher matcher = Pattern.compile("https?://\\S+").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
