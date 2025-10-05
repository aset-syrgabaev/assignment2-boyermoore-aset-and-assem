package edu.astanait.algorithms.kadane;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KadaneAlgorithmTest {

    @Test
    void testAllPositive() {
        int[] arr = {1, 2, 3, 4, 5};
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int maxSum = kadane.findMaxSubarraySum(arr);
        assertEquals(15, maxSum);
    }

    @Test
    void testAllNegative() {
        int[] arr = {-2, -3, -1, -5};
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int maxSum = kadane.findMaxSubarraySum(arr);
        assertEquals(-1, maxSum);
    }

    @Test
    void testMixedValues() {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int maxSum = kadane.findMaxSubarraySum(arr);
        assertEquals(6, maxSum); // [4, -1, 2, 1]
    }

    @Test
    void testSingleElement() {
        int[] arr = {7};
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int maxSum = kadane.findMaxSubarraySum(arr);
        assertEquals(7, maxSum);
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        KadaneAlgorithm kadane = new KadaneAlgorithm();
        int maxSum = kadane.findMaxSubarraySum(arr);
        assertEquals(0, maxSum);
    }
}
