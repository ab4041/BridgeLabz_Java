/*
3. Merge Sort - Sort an Array of Book Prices
Problem Statement:
A bookstore maintains a list of book prices in an array. Implement Merge Sort to sort the prices in ascending order.
Hint:
Divide the array into two halves recursively.
Sort both halves individually.
Merge the sorted halves by comparing elements.
*/

import java.util.Arrays;

public class MergeSortBookPrices {

    static void mergeSort(int[] prices, int left, int right) {
        if (left >= right) return; // base case

        int mid = left + (right - left) / 2;

        // Sort left half
        mergeSort(prices, left, mid);

        // Sort right half
        mergeSort(prices, mid + 1, right);

        // Merge sorted halves
        merge(prices, left, mid, right);
    }

    static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;  // size of left subarray
        int n2 = right - mid;     // size of right subarray

        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data into temp arrays
        for (int i = 0; i < n1; i++) L[i] = prices[left + i];
        for (int j = 0; j < n2; j++) R[j] = prices[mid + 1 + j];

        int i = 0, j = 0;
        int k = left;

        // Merge back into original array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i];
                i++;
            } else {
                prices[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements (if any)
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] bookPrices = {499, 299, 799, 199, 650, 150};

        System.out.println("Before Sorting: " + Arrays.toString(bookPrices));
        mergeSort(bookPrices, 0, bookPrices.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(bookPrices));
    }
}
