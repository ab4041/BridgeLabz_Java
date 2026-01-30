public class FindPeakElement {

    /*
     Binary Search Problem 2: Find the Peak Element in an Array
     Problem:
     A peak element is an element that is greater than its neighbors.
     Write a program to find a peak element in an array using Binary Search.
     If multiple peaks exist, return any one.

     Approach:
     Use binary search.
     If mid element is less than right neighbor -> peak lies on right side
     else -> peak lies on left side
    */

    public static int findPeakIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid is smaller than next element -> peak on right side
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                // peak on left side including mid
                right = mid;
            }
        }

        return left; // peak index
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeakIndex(arr);
        System.out.println("Peak Index: " + peakIndex);
        System.out.println("Peak Value: " + arr[peakIndex]);
    }
}
