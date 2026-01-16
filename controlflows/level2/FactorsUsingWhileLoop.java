/*
Question:
Rewrite factors program using while loop.

Hint:
- Use a counter variable
- Run while loop till counter < number
*/

import java.util.Scanner;

// Class to find factors using while loop
class FactorsUsingWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 1;

        if (number <= 0) {
            System.out.println("Enter a positive integer");
        } else {
            while (counter <= number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        }

        input.close();
    }
}
