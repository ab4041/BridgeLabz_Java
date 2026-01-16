/*
Question:
Create a program to find the youngest and tallest friend among Amar, Akbar, and Anthony.

Hint:
- Take age and height input for all three friends
- Find smallest age for youngest
- Find largest height for tallest
*/

import java.util.Scanner;

// Class to find youngest and tallest friend
class FriendComparison {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input ages
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        // Input heights
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        // Find youngest
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        // Find tallest
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        System.out.println("Youngest Age: " + youngestAge);
        System.out.println("Tallest Height: " + tallestHeight);

        input.close();
    }
}
