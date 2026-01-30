import java.util.HashSet;

public class RemoveDuplicatesUsingStringBuilder {

    /*
     StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
     Problem:
     Write a program that uses StringBuilder to remove all duplicate characters from
     a given string while maintaining the original order.

     Approach:
     Initialize an empty StringBuilder and a HashSet to keep track of characters.
     Iterate over each character in the string:
     If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
     Return the StringBuilder as a string without duplicates.
    */

    public static String removeDuplicates(String input) {
        HashSet<Character> seen = new HashSet<>();
        StringBuilder sb = new StringBuilder(); // store unique characters

        for (char ch : input.toCharArray()) {
            if (!seen.contains(ch)) {
                sb.append(ch);
                seen.add(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "programming";

        System.out.println("Input : " + input);
        System.out.println("Output: " + removeDuplicates(input));
    }
}
