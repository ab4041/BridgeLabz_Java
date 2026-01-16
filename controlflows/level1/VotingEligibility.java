/*
Question:
Write a program to check whether a person can vote.

I/P => age
*/

import java.util.Scanner;

// Class to check voting eligibility
class VotingEligibility {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read age
        int age = input.nextInt();

        // Check voting condition
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote.");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote.");
        }

        input.close();
    }
}
