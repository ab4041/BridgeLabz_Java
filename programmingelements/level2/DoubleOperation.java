/*
Question:
Write the DoubleOpt program by taking double values and performing
the same operations as IntOperation.

I/P => a, b, c
O/P => The results of Double Operations are ___, ___, ___, ___
*/

import java.util.Scanner;

// Class to demonstrate double operations
class DoubleOperation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Read double values
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // Perform operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Display results
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", " + result4
        );

        input.close();
    }
}
