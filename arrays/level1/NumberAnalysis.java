/*
Question:
Take 5 numbers and check positive, negative or zero.
For positive numbers check even or odd.
Finally compare first and last element.
*/

import java.util.Scanner;

// Class to analyze numbers in an array
class NumberAnalysis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input values
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Analyze numbers
        for (int num : numbers) {

            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        // Compare first and last element
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are Equal");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater");
        } else {
            System.out.println("Last element is Greater");
        }

        input.close();
    }
}
