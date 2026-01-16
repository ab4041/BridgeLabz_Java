/*
Question:
Find character frequency using nested loops.
*/

import java.util.Scanner;

class FrequencyNestedLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        System.out.println("Char\tFrequency");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                System.out.println(chars[i] + "\t" + freq[i]);
            }
        }
        sc.close();
    }
}
