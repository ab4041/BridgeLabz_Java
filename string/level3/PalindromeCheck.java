/*
Question:
Check palindrome using iterative, recursive and reverse logic.
*/

import java.util.Scanner;

class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {

        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start++) != text.charAt(end--)) return false;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text, int start, int end) {

        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeReverse(String text) {

        char[] original = text.toCharArray();
        char[] reverse = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        System.out.println(isPalindromeIterative(text));
        System.out.println(isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println(isPalindromeReverse(text));
        sc.close();
    }
}
