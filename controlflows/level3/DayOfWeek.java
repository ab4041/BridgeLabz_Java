/*
Question:
Write a program DayOfWeek that prints the day of the week for a given date.

Hint:
- Use Gregorian calendar formulas
- Output: 0 = Sunday, 1 = Monday, ...
*/

import java.util.Scanner;

// Class to find day of week
class DayOfWeek {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int m = input.nextInt(); // month
        int d = input.nextInt(); // day
        int y = input.nextInt(); // year

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week: " + d0);

        input.close();
    }
}
