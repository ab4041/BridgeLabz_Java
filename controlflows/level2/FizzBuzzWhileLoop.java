/*
Question:
Rewrite the FizzBuzz program using while loop.

Hint:
- Take positive integer input
- Use while loop to iterate and apply FizzBuzz logic
*/

import java.util.Scanner;

// Class to implement FizzBuzz using while loop
class FizzBuzzWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int counter = 1;

        // Check positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            while (counter <= number) {

                if (counter % 3 == 0 && counter % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (counter % 3 == 0) {
                    System.out.println("Fizz");
                } else if (counter % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(counter);
                }

                counter++;
            }
        }

        input.close();
    }
}
