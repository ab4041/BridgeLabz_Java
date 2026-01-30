/*
4. Quick Sort - Sort Product Prices
Problem Statement:
An e-commerce company wants to display product prices in ascending order. Implement Quick Sort to sort the product prices.
Hint:
Pick a pivot element (first, last, or random).
Partition the array such that elements smaller than the pivot are on the left and larger ones are on the right.
Recursively apply Quick Sort on left and right partitions.
*/

import java.util.Arrays;

public class QuickSortProductPrices {

    static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(prices, low, high);

            // Sort left side of pivot
            quickSort(prices, low, pivotIndex - 1);

            // Sort right side of pivot
            quickSort(prices, pivotIndex + 1, high);
        }
    }

    // Partition using last element as pivot
    static int partition(int[] prices, int low, int high) {
        int pivot = prices[high];
        int i = low - 1; // index for smaller elements

        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }

        // Place pivot in correct position
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] productPrices = {1200, 500, 1500, 800, 300, 999};

        System.out.println("Before Sorting: " + Arrays.toString(productPrices));
        quickSort(productPrices, 0, productPrices.length - 1);
        System.out.println("After Sorting : " + Arrays.toString(productPrices));
    }
}
