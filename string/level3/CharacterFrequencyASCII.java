/*
Question:
Find frequency of characters using ASCII array.
*/

import java.util.Scanner;

class CharacterFrequencyASCII {

    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) count++;
        }

        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(freq[i]);
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[][] table = findFrequency(text);
        System.out.println("Char\tFrequency");

        for (String[] row : table) {
            System.out.println(row[0] + "\t" + row[1]);
        }
        sc.close();
    }
}
