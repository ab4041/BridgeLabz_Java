/*
Question:
Count vowels and consonants in a string.
*/

import java.util.Scanner;

class VowelConsonantCounter {

    public static String classifyChar(char ch) {

        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z') {
            return "aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant";
        }
        return "NotLetter";
    }

    public static int[] countVowelsConsonants(String text) {

        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String result = classifyChar(text.charAt(i));
            if (result.equals("Vowel")) vowels++;
            if (result.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
        sc.close();
    }
}
