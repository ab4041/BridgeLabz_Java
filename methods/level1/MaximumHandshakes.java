/*
Question:
Create a program to find the maximum number of handshakes among N number of students.

Hint =>
Use the combination formula:
Handshakes = (n * (n - 1)) / 2

Steps:
1. Take input for number of students
2. Use combination formula
3. Display result
*/

import java.util.Scanner;

class MaximumHandshakes {

    // Method to calculate handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Taking user input
        int numberOfStudents = input.nextInt();

        // Calling method
        int handshakes = calculateHandshakes(numberOfStudents);

        // Display result
        System.out.println("Maximum number of handshakes: " + handshakes);

        input.close();
    }
}
