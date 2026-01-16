/*
Question:
Save odd and even numbers into separate arrays.
*/

import java.util.Scanner;

// Class to separate odd and even numbers
class OddEvenArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Invalid number");
            System.exit(0);
        }

        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(even[i] + " ");
        }

        input.close();
    }
}
