/*
Question:
Trim leading and trailing spaces using charAt()
and compare with trim().
*/

import java.util.Scanner;

class ManualTrim {

    public static int[] findTrimIndexes(String text) {

        int start = 0, end = text.length() - 1;

        while (start <= end && text.charAt(start) == ' ') start++;
        while (end >= start && text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    public static String createSubstring(String text, int start, int end) {

        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String manualTrim = createSubstring(text, indexes[0], indexes[1]);

        System.out.println("Manual Trim: [" + manualTrim + "]");
        System.out.println("Built-in Trim: [" + text.trim() + "]");
        sc.close();
    }
}
