/*
Question:
Copy a 2D array into a 1D array.
*/

import java.util.Scanner;

// Class to copy 2D array into 1D array
class Copy2DTo1D {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        int index = 0;

        // Input matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
                array[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        for (int value : array) {
            System.out.print(value + " ");
        }

        input.close();
    }
}
