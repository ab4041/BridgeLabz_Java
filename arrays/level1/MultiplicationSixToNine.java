/*
Question:
Find multiplication table from 6 to 9 using array.
*/

import java.util.Scanner;

// Class to generate table from 6 to 9
class MultiplicationSixToNine {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        int[] results = new int[4];

        int index = 0;
        for (int i = 6; i <= 9; i++) {
            results[index++] = number * i;
        }

        index = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + results[index++]);
        }

        input.close();
    }
}
