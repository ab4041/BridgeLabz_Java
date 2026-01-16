/*
Question:
Find shortest and longest word from text.
*/

import java.util.Scanner;

class ShortestLongestFinder {

    public static int[] findShortestLongest(String[] words) {

        int min = 0, max = 0;

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < words[min].length()) min = i;
            if (words[i].length() > words[max].length()) max = i;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        int[] result = findShortestLongest(words);

        System.out.println("Shortest Word: " + words[result[0]]);
        System.out.println("Longest Word: " + words[result[1]]);
        sc.close();
    }
}
