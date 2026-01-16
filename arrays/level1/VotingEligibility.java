/*
Question:
Write a program to take user input for the age of all 10 students in a class
and check whether the student can vote.

Hint:
- Define an integer array of size 10
- Validate age (no negative values)
- If age >= 18 → can vote, else cannot vote
*/

import java.util.Scanner;

// Class to check voting eligibility
class VotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Declare array to store ages
        int[] ages = new int[10];

        // Take input for ages
        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();

            // Validate age
            if (ages[i] < 0) {
                System.err.println("Invalid age entered.");
                System.exit(0);
            }
        }

        // Check voting eligibility
        for (int age : ages) {
            if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}
