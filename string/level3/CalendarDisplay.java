/*
Question:
Display calendar for given month and year.
*/

import java.util.Scanner;

class CalendarDisplay {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int getFirstDay(int month, int year) {

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31*m0/12) % 7;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int year = sc.nextInt();

        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month == 2 && isLeapYear(year)) days[1] = 29;

        int firstDay = getFirstDay(month, year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < firstDay; i++) System.out.print("    ");

        for (int day = 1; day <= days[month - 1]; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) System.out.println();
        }
        sc.close();
    }
}
