/*
Question:
Write a program FizzBuzz using for loop.

Hint:
- Take user input number
- Check for positive integer
- Print numbers from 1 to number
- For multiples of 3 print "Fizz"
- For multiples of 5 print "Buzz"
- For multiples of both print "FizzBuzz"
*/

import java.util.Scanner;

// Class to implement FizzBuzz using for loop
class FizzBuzzForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input
        int number = input.nextInt();

        // Check positive integer
        if (number <= 0) {
            System.out.println("Please enter a positive integer");
        } else {
            for (int i = 1; i <= number; i++) {

                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        input.close();
    }
}
