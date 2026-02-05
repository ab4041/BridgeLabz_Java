import java.util.regex.*;

/*
Problem:
Extract all words starting with capital letters
*/

public class CapitalizedWordsExtractor {

    public static void main(String[] args) {

        String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York";
        Matcher matcher = Pattern.compile("\\b[A-Z][a-z]*\\b").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
