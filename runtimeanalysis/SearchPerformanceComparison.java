/*
Problem Statement: Search a Target in a Large Dataset

Objective:
Compare the performance of Linear Search (O(N)) and Binary Search (O(log N))
on different dataset sizes.

Approach:
- Linear Search: Scan each element until the target is found.
- Binary Search: Sort the data first, then apply binary search.

Expected Result:
Binary Search performs much better for large datasets when data is sorted.
*/

import java.util.*;

public class SearchPerformanceComparison {

    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) return true;
        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int target) {
        return Arrays.binarySearch(arr, target) >= 0;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(n);
        }

        int target = arr[n - 1];

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) + " ns");

        Arrays.sort(arr);

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) + " ns");
    }
}
