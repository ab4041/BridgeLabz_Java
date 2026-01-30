/*
Sliding Window Maximum
Problem:
Given an array and a window size k, find the maximum element
in each sliding window of size k.
Hint:
Use a deque (double-ended queue) to maintain indices of useful elements in each window.
*/

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class SlidingWindowMaximum {

    static int[] maxSlidingWindow(int[] arr, int k) {
        int n = arr.length;
        if (k <= 0 || k > n) return new int[0];

        int[] result = new int[n - k + 1];
        int idx = 0;

        Deque<Integer> dq = new ArrayDeque<>(); // stores indices of elements

        for (int i = 0; i < n; i++) {

            // Remove indices that are out of window range
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // Remove smaller elements from back (they are useless)
            while (!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]) {
                dq.pollLast();
            }

            dq.offerLast(i); // add current index

            // Window formed => store max
            if (i >= k - 1) {
                result[idx++] = arr[dq.peekFirst()];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("Max in windows: " + Arrays.toString(maxSlidingWindow(arr, k)));
    }
}
