/*
Question:
Convert complete text to lowercase using charAt() and compare with
built-in toLowerCase() method.

Hint:
- Use ASCII logic (difference = 32)
*/

import java.util.Scanner;

class LowerCaseConversion {

    public static String toLowerCaseManual(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
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

        String manual = toLowerCaseManual(text);
        String builtIn = text.toLowerCase();

        System.out.println("Manual Lowercase: " + manual);
        System.out.println("Built-in Lowercase: " + builtIn);
        System.out.println("Are both same? " + compareStrings(manual, builtIn));

        sc.close();
    }
}
