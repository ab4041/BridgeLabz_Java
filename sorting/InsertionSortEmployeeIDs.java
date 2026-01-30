/*
2. Insertion Sort - Sort Employee IDs
Problem Statement:
A company stores employee IDs in an unsorted array. Implement Insertion Sort to sort the employee IDs in ascending order.
Hint:
Divide the array into sorted and unsorted parts.
Pick an element from the unsorted part and insert it into its correct position in the sorted part.
Repeat for all elements.
*/

import java.util.Arrays;

public class InsertionSortEmployeeIDs {

    static void insertionSort(int[] ids) {
        int n = ids.length;

        // Start from index 1 because index 0 is already "sorted"
        for (int i = 1; i < n; i++) {

            int key = ids[i];   // element to insert in correct position
            int j = i - 1;

            // Move elements greater than key one position ahead
            while (j >= 0 && ids[j] > key) {
                ids[j + 1] = ids[j];
                j--;
            }

            // Place key at correct position
            ids[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {105, 101, 110, 103, 108, 102};

        System.out.println("Before Sorting: " + Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("After Sorting : " + Arrays.toString(employeeIDs));
    }
}
