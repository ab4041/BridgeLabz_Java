import java.util.regex.*;

/*
Problem:
Extract dates in dd/mm/yyyy format
*/

public class DateExtractor {

    public static void main(String[] args) {

        String text = "Dates: 12/05/2023, 15/08/2024, 29/02/2020";
        Matcher matcher = Pattern.compile("\\b\\d{2}/\\d{2}/\\d{4}\\b").matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
