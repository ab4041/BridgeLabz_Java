/*
Problem:
Replace multiple spaces with a single space
*/

public class SpaceNormalizer {

    public static void main(String[] args) {

        String text = "This   is    an example   text";
        System.out.println(text.replaceAll("\\s+", " "));
    }
}
