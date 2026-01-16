/*
Question:
Write a program SpringSeason that checks whether a given month and day
falls under Spring Season.

Hint =>
Spring Season: March 20 to June 20
*/

import java.util.Scanner;

class SpringSeason {

    // Method to check spring season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) ||
               (month == 4) ||
               (month == 5) ||
               (month == 6 && day <= 20);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        int day = input.nextInt();

        // Calling method
        boolean result = isSpringSeason(month, day);

        System.out.println(result ? "Its a Spring Season" : "Not a Spring Season");

        input.close();
    }
}
