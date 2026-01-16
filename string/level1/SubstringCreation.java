/*
Question:
Write a program to create a substring using charAt() method and
compare it with String built-in substring() method.

Hint:
- Take string, start index, and end index as input
- Create substring manually using charAt()
- Compare both substrings
*/

import java.util.Scanner;

class SubstringCreation {

    // Method to create substring using charAt()
    public static String createSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        String manualSubstring = createSubstring(text, start, end);
        String builtInSubstring = text.substring(start, end);

        boolean isSame = compareStrings(manualSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + manualSubstring);
        System.out.println("Substring using built-in method: " + builtInSubstring);
        System.out.println("Are both substrings equal? " + isSame);

        sc.close();
    }
}
