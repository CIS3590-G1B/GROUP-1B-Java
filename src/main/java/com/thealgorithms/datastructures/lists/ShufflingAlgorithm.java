package com.thealgorithms.datastructures.lists;
import java.util.Random;

public class ShufflingAlgorithm {

    /* This Fisher-Yates Shuffling Algorithm aims to completely randomize any given list 
     * ensuring that every possible permutation of a certain list is equally probable */

    public static void shuffle(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return; // returns the array as given if its empty or has only 1 element
        }
        
        Random r = new Random();

        for (int i = arr.length - 1; i > 0; i--) {
            int j = r.nextInt(i + 1); 
            swap(arr, i, j); 
        }
    }


    private static void swap(int[] arr, int i, int j) { // function to swap elements in array
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }


      // Main method for testing the Fisher-Yates shuffle. 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        System.out.println("Original array:");
        printArray(arr);
        
        shuffle(arr);
        
        System.out.println("Shuffled array:");
        printArray(arr);
    }

    
    public static void printArray(int[] arr) { // Method to print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


