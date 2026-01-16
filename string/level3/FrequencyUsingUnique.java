/*
Question:
Find frequency using unique characters.
*/

import java.util.Scanner;

class FrequencyUsingUnique {

    public static char[] uniqueChars(String text) {

        char[] temp = new char[text.length()];
        int idx = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    unique = false;
                    break;
                }
            }
            if (unique) temp[idx++] = text.charAt(i);
        }

        char[] result = new char[idx];
        System.arraycopy(temp, 0, result, 0, idx);
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = uniqueChars(text);
        System.out.println("Char\tFrequency");

        for (char c : unique) {
            int count = 0;
            for (int i = 0; i < text.length(); i++) {
                if (c == text.charAt(i)) count++;
            }
            System.out.println(c + "\t" + count);
        }
        sc.close();
    }
}
