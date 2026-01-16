/*
Question:
Write a program to count down numbers for a rocket launch using while loop.
*/

import java.util.Scanner;

// Class for countdown using while loop
class RocketCountdownWhile {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read counter value
        int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }

        input.close();
    }
}
