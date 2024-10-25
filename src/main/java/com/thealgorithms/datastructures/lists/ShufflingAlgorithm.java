package com.thealgorithms.datastructures.lists;
import java.util.Arrays;
import java.util.Random;

public class FisherYatesShuffle {

    /**
     * Implements the Fisher-Yates shuffle algorithm. 
     * Shuffles an array in place.
     * This Algorithm aims to randomize any given list or array in a way such that every permutation is equally possible.
     * 
     * @param arr The array to shuffle.
     */
    public static void shuffle(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // No need to shuffle if array is empty or has one element
        }
        
        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1); // Generate a random index from 0 to i
            swap(arr, i, j); // Swap the current element with the randomly chosen element
        }
    }

    /**
     * Helper function to swap two elements in an array.
     * 
     * @param arr The array containing the elements.
     * @param i   The index of the first element.
     * @param j   The index of the second element.
     */
    private static void swap(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    /**
     * Main method for testing the Fisher-Yates shuffle.
     * 
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Original array:");
        printArray(arr);
        
        shuffle(arr);
        
        System.out.println("Shuffled array:");
        printArray(arr);
    }

    /**
     * Utility method to print an array.
     * 
     * @param arr The array to print.
     */
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


