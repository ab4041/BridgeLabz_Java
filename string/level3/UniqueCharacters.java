/*
Question:
Find unique characters in a string using charAt().
*/

import java.util.Scanner;

class UniqueCharacters {

    public static char[] findUniqueCharacters(String text) {

        char[] temp = new char[text.length()];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[index++] = text.charAt(i);
            }
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);
        System.out.print("Unique Characters: ");

        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
