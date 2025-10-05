package edu.astanait.algorithms.boyermoore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreTest {

    @Test
    void testMajoritySimple() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {1, 2, 1, 1, 3};
        Integer result = algo.findMajority(arr);
        assertEquals(1, result);
    }

    @Test
    void testAllSame() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {5, 5, 5, 5, 5};
        Integer result = algo.findMajority(arr);
        assertEquals(5, result);
    }

    @Test
    void testNoMajority() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {1, 2, 3, 4};
        Integer result = algo.findMajority(arr);
        assertNotNull(result); // candidate still exists, but not necessarily > n/2
    }

    @Test
    void testEvenCount() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {2, 2, 3, 3, 3, 2, 2};
        Integer result = algo.findMajority(arr);
        assertEquals(2, result);
    }

    @Test
    void testLargeArray() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = new int[1000];
        for (int i = 0; i < 800; i++) arr[i] = 7;
        for (int i = 800; i < 1000; i++) arr[i] = 9;
        Integer result = algo.findMajority(arr);
        assertEquals(7, result);
    }
}
