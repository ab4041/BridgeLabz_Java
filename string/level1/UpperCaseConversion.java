/*
Question:
Convert complete text to uppercase using charAt() and compare with
built-in toUpperCase() method.

Hint:
- Use ASCII logic (difference = 32)
*/

import java.util.Scanner;

class UpperCaseConversion {

    public static String toUpperCaseManual(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
            }
            result += ch;
        }
        return result;
    }

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
        String text = sc.nextLine();

        String manual = toUpperCaseManual(text);
        String builtIn = text.toUpperCase();

        System.out.println("Manual Uppercase: " + manual);
        System.out.println("Built-in Uppercase: " + builtIn);
        System.out.println("Are both same? " + compareStrings(manual, builtIn));

        sc.close();
    }
}
