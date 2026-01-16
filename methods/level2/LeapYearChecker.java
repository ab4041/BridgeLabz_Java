/*
Question:
Write a program that takes a year as input and outputs whether the year is a Leap Year.

Hint =>
The LeapYear program only works for year >= 1582
Leap year is divisible by 4 and not divisible by 100 or divisible by 400
*/

import java.util.Scanner;

class LeapYearChecker {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        System.out.println(isLeapYear(year) ? "Leap Year" : "Not a Leap Year");

        input.close();
    }
}
