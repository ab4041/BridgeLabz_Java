public class ConcatenateUsingStringBuffer {

    /*
     StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
     Problem:
     You are given an array of strings. Write a program that uses StringBuffer
     to concatenate all the strings in the array efficiently.

     Approach:
     Create a new StringBuffer object.
     Iterate through each string in the array and append it to the StringBuffer.
     Return the concatenated string after the loop finishes.
     Using StringBuffer ensures efficient string concatenation due to its mutable nature.
    */

    public static String concatenate(String[] arr) {
        // StringBuffer is synchronized -> thread-safe
        StringBuffer sb = new StringBuffer();

        for (String s : arr) {
            sb.append(s); // efficient compared to +
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] words = {"Java", " ", "is", " ", "awesome"};

        System.out.println("Result: " + concatenate(words));
    }
}
