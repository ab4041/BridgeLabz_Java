/*
Question:
Write a program to compare two strings using the charAt() method and
check the result with the built-in String equals() method.

Hint:
- Take user input using Scanner next()
- Write a method to compare strings using charAt()
- Use equals() and compare both results
*/

import java.util.Scanner;

class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.next();

        System.out.print("Enter second string: ");
        String second = sc.next();

        boolean charAtResult = compareUsingCharAt(first, second);
        boolean equalsResult = first.equals(second);

        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        sc.close();
    }
}
