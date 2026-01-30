/*
Problem Statement: Sorting Large Data Efficiently

Objective:
Compare Bubble Sort (O(N^2)), Merge Sort (O(N log N)),
and Quick Sort (O(N log N)).

Expected Result:
Bubble Sort is impractical for large datasets.
Merge Sort and Quick Sort perform efficiently.
*/

import java.util.*;

public class SortingPerformanceComparison {

    public static void main(String[] args) {
        int n = 100_000;
        int[] arr = new Random().ints(n, 0, n).toArray();

        int[] bubbleArr = arr.clone();
        int[] mergeArr = arr.clone();
        int[] quickArr = arr.clone();

        long start, end;

        start = System.nanoTime();
        bubbleSort(bubbleArr);
        end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.sort(mergeArr);
        end = System.nanoTime();
        System.out.println("Merge Sort Time: " + (end - start) + " ns");

        start = System.nanoTime();
        Arrays.sort(quickArr);
        end = System.nanoTime();
        System.out.println("Quick Sort Time: " + (end - start) + " ns");
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
