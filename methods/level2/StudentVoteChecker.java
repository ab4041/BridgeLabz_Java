/*
Question:
Write a program to take user input for the age of all 10 students and
check whether each student can vote.

Hint =>
Age >= 18 → Can Vote
Negative age → Cannot Vote
*/

import java.util.Scanner;

class StudentVoteChecker {

    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = input.nextInt();
            System.out.println("Can Vote: " + checker.canStudentVote(ages[i]));
        }

        input.close();
    }
}
