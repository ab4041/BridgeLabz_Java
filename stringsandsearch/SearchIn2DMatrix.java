public class SearchIn2DMatrix {

    /*
     Binary Search Problem 3: Search for a Target Value in a 2D Sorted Matrix
     Problem:
     You are given a 2D matrix where:
     - each row is sorted in ascending order
     - the first element of each row is greater than the last element of previous row
     Find target value, return true else false.

     Approach:
     Treat 2D matrix as 1D array
     left = 0, right = rows*cols - 1
     mid -> row = mid/cols, col = mid%cols
    */

    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int r = mid / cols;
            int c = mid % cols;

            if (matrix[r][c] == target) {
                return true;
            } else if (matrix[r][c] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        System.out.println("Found? " + searchMatrix(matrix, target));
    }
}
