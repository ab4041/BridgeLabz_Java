/*
Question:
Write an IntOperation program by taking a, b, and c as input values
and print the following:
a + b * c
a * b + c
c + a / b
a % b + c

I/P => a, b, c
O/P => The results of Int Operations are ___, ___, ___, ___
*/

import java.util.Scanner;

// Class to demonstrate integer operator precedence
class IntOperation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read integer values
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // Perform operations
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        // Display results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", " + result4
        );

        input.close();
    }
}
