public class FindRotationPoint {

    /*
     Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
     Problem:
     You are given a rotated sorted array.
     Write a program that performs Binary Search to find the index of the smallest element
     in the array (rotation point).

     Approach:
     left = 0, right = n-1
     while left < right:
        mid = left + (right-left)/2
        if arr[mid] > arr[right] -> left = mid + 1
        else -> right = mid
     answer = left
    */

    public static int findRotationIndex(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2; // avoids overflow

            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left; // index of smallest element
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Rotation Point Index: " + findRotationIndex(arr));
    }
}
