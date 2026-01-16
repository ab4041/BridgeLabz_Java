/*
Question:
Split text into words using charAt() and compare
with built-in split() method.
*/

import java.util.Scanner;

class WordSplitComparator {

    public static String[] splitUsingCharAt(String text) {

        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        int start = 0, index = 0;

        for (int i = 0; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) == ' ') {
                String word = "";
                for (int j = start; j < i; j++) {
                    word += text.charAt(j);
                }
                words[index++] = word;
                start = i + 1;
            }
        }
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] manual = splitUsingCharAt(text);
        String[] builtIn = text.split(" ");

        System.out.println("Are both results same? " + compareArrays(manual, builtIn));
        sc.close();
    }
}
