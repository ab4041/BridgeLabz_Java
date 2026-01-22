/*
6. Heap Sort - Sort Job Applicants by Salary
Problem Statement:
A company receives job applications with different expected salary demands. Implement Heap Sort to sort these salary demands in ascending order.
Hint:
Build a Max Heap from the array.
Extract the largest element (root) and place it at the end.
Reheapify the remaining elements and repeat until sorted.
*/

import java.util.Arrays;

public class HeapSortSalaryDemands {

    static void heapSort(int[] salaries) {
        int n = salaries.length;

        // Step 1: Build Max Heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }

        // Step 2: Extract elements from heap one by one
        for (int i = n - 1; i > 0; i--) {

            // Swap root (largest) with last element
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;

            // heapify reduced heap
            heapify(salaries, i, 0);
        }
    }

    // Heapify subtree rooted at index i
    static void heapify(int[] arr, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        // If left child is larger
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        // If right child is larger
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, heapSize, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaryDemands = {60000, 45000, 75000, 50000, 90000, 55000};

        System.out.println("Before Sorting: " + Arrays.toString(salaryDemands));
        heapSort(salaryDemands);
        System.out.println("After Sorting : " + Arrays.toString(salaryDemands));
    }
}
