/*
Question:
FizzBuzz using array storage.
*/

import java.util.Scanner;

// Class to implement FizzBuzz using array
class FizzBuzzArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid input");
            System.exit(0);
        }

        String[] results = new String[number + 1];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }

        // Display results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        input.close();
    }
}
