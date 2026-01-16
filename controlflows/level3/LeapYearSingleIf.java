/*
Question:
Rewrite Leap Year program using a single if condition with logical operators.

Hint:
- Use && and || operators
*/

import java.util.Scanner;

// Class to check Leap Year using single if condition
class LeapYearSingleIf {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int year = input.nextInt();

        // Check leap year using single condition
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

        input.close();
    }
}
