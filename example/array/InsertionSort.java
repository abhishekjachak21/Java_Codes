package com.examples.array;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        // Loop through each element in the array starting from the second
        for (int i = 1; i < array.length; i++) {
            int key = array[i]; // The element to be inserted
            int j = i - 1;

            // Shift elements of the sorted portion (to the left) that are greater than the key
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // Move element one position to the right
                j--;
            }
            // Insert the key at its correct position
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 25, 12, 20, 9};

        System.out.println("Original array:");
        printArray(array); // Print original array

        insertionSort(array); // Sort the array

        System.out.println("Sorted array:");
        printArray(array); // Print sorted array
    }

    // Helper method to print the array
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // New line for better readability
    }
}
