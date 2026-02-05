/*
Problem:
Replace bad words with ****
*/

public class BadWordCensor {

    public static void main(String[] args) {

        String text = "This is a damn bad example with some stupid words";
        String regex = "\\b(damn|stupid)\\b";

        System.out.println(text.replaceAll(regex, "****"));
    }
}
