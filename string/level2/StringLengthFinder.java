/*
Question:
Write a program to find and return the length of a string
without using the built-in length() method.

Hint:
- Use infinite loop with charAt()
- Handle runtime exception
- Compare with built-in length()
*/

import java.util.Scanner;

class StringLengthFinder {

    // Method to find string length without using length()
    public static int findLengthWithoutLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Loop stops when index exceeds length
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        int manualLength = findLengthWithoutLength(text);
        int builtInLength = text.length();

        System.out.println("Manual Length: " + manualLength);
        System.out.println("Built-in Length: " + builtInLength);
        sc.close();
    }
}
