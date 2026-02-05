import java.util.regex.*;

/*
Problem:
Extract programming language names from text
*/

public class LanguageExtractor {

    public static void main(String[] args) {

        String text = "I love Java, Python, JavaScript and Go";
        Matcher matcher = Pattern.compile("\\b(Java|Python|JavaScript|Go)\\b").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
