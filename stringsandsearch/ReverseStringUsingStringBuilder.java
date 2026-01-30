public class ReverseStringUsingStringBuilder {

    /*
     StringBuilder Problem 1: Reverse a String Using StringBuilder
     Problem:
     Write a program that uses StringBuilder to reverse a given string.
     For example, if the input is "hello", the output should be "olleh".

     Approach:
     Create a new StringBuilder object.
     Append the string to the StringBuilder.
     Use the reverse() method of StringBuilder to reverse the string.
     Convert the StringBuilder back to a string and return it.
    */

    public static String reverseString(String input) {
        // StringBuilder is mutable -> best for performance
        StringBuilder sb = new StringBuilder(input);

        // reverse() returns the same StringBuilder object after reversing
        sb.reverse();

        // Convert back to String
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello";

        String output = reverseString(input);

        System.out.println("Input : " + input);
        System.out.println("Output: " + output);
    }
}
