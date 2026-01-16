/*
Question:
Display character type – Vowel, Consonant, or Not a Letter.
*/

import java.util.Scanner;

class CharacterTypeTable {

    public static String[][] analyzeCharacters(String text) {

        String[][] table = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            table[i][0] = String.valueOf(ch);
            table[i][1] = VowelConsonantCounter.classifyChar(ch);
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] table = analyzeCharacters(text);
        System.out.println("Char\tType");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
        sc.close();
    }
}
