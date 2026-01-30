public class FirstAndLastOccurrence {

    /*
     Binary Search Problem 4: Find the First and Last Occurrence of an Element in a Sorted Array
     Problem:
     Given a sorted array and a target element,
     find the first and last occurrence of the target.
     If not found return -1.

     Approach:
     Use binary search twice:
     1) findFirstOccurrence
     2) findLastOccurrence
    */

    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1; // go left to find first
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1; // go right to find last
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8};
        int target = 4;

        System.out.println("First Occurrence: " + findFirst(arr, target));
        System.out.println("Last Occurrence : " + findLast(arr, target));
    }
}
