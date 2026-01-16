/*
Question:
Write a program to return all characters in a string using a
user-defined method and compare with toCharArray().

Hint:
- Do not use toCharArray() in user-defined method
- Compare both arrays
*/

import java.util.Scanner;

class CharacterArrayComparison {

    // Method to return characters using charAt()
    public static char[] getCharacters(String text) {

        char[] chars = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareArrays(char[] a, char[] b) {

        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char[] manualArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean result = compareArrays(manualArray, builtInArray);

        System.out.println("Are both character arrays equal? " + result);

        sc.close();
    }
}
