/*
Question:
Rewrite countdown program using for loop.
*/

import java.util.Scanner;

// Class for countdown using for loop
class RocketCountdownFor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        input.close();
    }
}
