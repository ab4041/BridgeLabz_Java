/*
Question:
Write a LeapYear program that takes a year as input and outputs whether the year is a Leap Year or not.

Hint:
- Leap Year works only for year >= 1582
- A year is a Leap Year if:
  1. Divisible by 400 OR
  2. Divisible by 4 and NOT divisible by 100
*/

import java.util.Scanner;

// Class to check Leap Year using multiple if-else
class LeapYearChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take year input
        int year = input.nextInt();

        // Check Gregorian calendar condition
        if (year < 1582) {
            System.out.println("Year must be 1582 or later");
        } else {
            // Leap year conditions
            if (year % 400 == 0) {
                System.out.println("Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Leap Year");
            } else {
                System.out.println("Not a Leap Year");
            }
        }

        input.close();
    }
}
