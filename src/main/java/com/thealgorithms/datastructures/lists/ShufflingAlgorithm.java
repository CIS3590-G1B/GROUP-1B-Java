package com.thealgorithms.datastructures.lists;
import java.util.Random;

class ShufflingAlgorithm {

    /* This Fisher-Yates Shuffling Algorithm aims to completely randomize any given list
     * ensuring that every possible permutation of a certain list is equally probable */

    public static void shuffle(Object[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // returns the array as given if its empty or has only 1 element
        }

        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1);
            swap(arr, i, j);
        }
    }


    private static void swap(Object[] arr, int i, int j) { // function to swap elements in array
        Object x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }


    // Main method for testing the Fisher-Yates shuffle.
    public static void main(String[] args) {
        Object[] arr = {1, "write", "java", 5};

        System.out.println("Original array:");
        printArray(arr);

        shuffle(arr);

        System.out.println("Shuffled array:");
        printArray(arr);
    }


    public static void printArray(Object[] arr) { // Method to print array
        for (Object num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


