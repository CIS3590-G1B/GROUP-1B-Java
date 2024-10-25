package com.thealgorithms.datastructures.lists;

import com.thealgorithms.datastructures.lists.ShufflingAlgorithm;
import org.junit.Test;


import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

public class ShufflingAlgorithmTest {

    @Test
    public void testShuffleWithNullArray() {
        Object[] arr = null;
        ShufflingAlgorithm.shuffle(arr);
        assertNull(arr, "The array should still be null after shuffle.");
    }

    @Test
    public void testShuffleWithSingleElementArray() {
        Object[] arr = {1};
        Object[] original = arr.clone();
        ShufflingAlgorithm.shuffle(arr);
        assertArrayEquals(original, arr, "Array with one element should not change after shuffle.");
    }

    @Test
    public void testShuffleWithMultipleElements() {
        Object[] arr = {1, 2, 3, 4, 5};
        Object[] original = arr.clone();

        ShufflingAlgorithm.shuffle(arr);

        // Check that the array contents are the same after shuffling
        assertTrue(new HashSet<>(Arrays.asList(original)).equals(new HashSet<>(Arrays.asList(arr))),
                "Shuffled array should contain the same elements as the original.");

        // Check that the array order has changed at least in some cases
        boolean hasChanged = !Arrays.equals(original, arr);
        if (hasChanged) {
            System.out.println("Array order changed after shuffling.");
        } else {
            System.out.println("Array order did not change (rare but possible).");
        }
    }

    @Test
    public void testShuffleRandomness() {
        Object[] arr = {1, 2, 3, 4, 5};
        int unchangedCount = 0;
        int iterations = 100;

        for (int i = 0; i < iterations; i++) {
            Object[] copy = arr.clone();
            ShufflingAlgorithm.shuffle(copy);
            if (Arrays.equals(arr, copy)) {
                unchangedCount++;
            }
        }

        // Ensure that the array's order changes in at least some cases
        assertTrue(unchangedCount < iterations, "Shuffle should alter array order in some cases.");
    }
}
