import java.util.Arrays;

public class LinearAndBinarySearchChallenge {

    /*
     Challenge Problem (for both Linear and Binary Search)
     Problem:
     You are given a list of integers.
     1) Use Linear Search to find the first missing positive integer in the list.
     2) Use Binary Search to find the index of a given target number (after sorting).

     Approach:
     Part 1 (First Missing Positive):
     - Check from 1 onwards
     - If number not found in array -> that is first missing positive
     - Simple approach using repeated linear search (easy to understand)

     Part 2 (Binary Search after sorting):
     - Sort the array
     - Apply binary search to find the target index
     - Return index if found else -1
    */

    //  Part 1: Find First Missing Positive using Linear Search logic
    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // We check missing number from 1 to n+1
        // Because answer will always be in this range
        for (int candidate = 1; candidate <= n + 1; candidate++) {

            boolean found = false;

            // Linear search for candidate
            for (int value : arr) {
                if (value == candidate) {
                    found = true;
                    break;
                }
            }

            // If candidate not found -> it's the first missing positive
            if (!found) {
                return candidate;
            }
        }

        return -1; // logically won't happen
    }

    //  Part 2: Binary Search to find target index (array must be sorted)
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // avoids overflow

            if (arr[mid] == target) {
                return mid; // found target
            } else if (arr[mid] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, -1, 1};

        //  Part 1 output
        int missing = firstMissingPositive(arr);
        System.out.println("First Missing Positive: " + missing);

        //  Part 2 output
        int target = 4;

        // Sort array before binary search
        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Target = " + target);

        int index = binarySearch(arr, target);
        System.out.println("Binary Search Index: " + index);
    }
}
