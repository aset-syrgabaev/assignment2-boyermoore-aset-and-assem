package edu.astanait.algorithms.boyermoore;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BoyerMooreMajorityTest {

    @Test
    public void testMajoritySimple() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {3, 3, 4, 2, 3, 3, 5, 3};
        assertEquals(3, algo.findMajority(arr));
    }

    @Test
    public void testMajoritySingle() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {7};
        assertEquals(7, algo.findMajority(arr));
    }

    @Test
    public void testMajorityNoMajority() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {1, 2, 3, 4};
        Integer result = algo.findMajority(arr);
        assertNotNull(result);
    }

    @Test
    public void testPerformanceTracking() {
        BoyerMooreMajority algo = new BoyerMooreMajority();
        int[] arr = {1, 1, 1, 2, 3, 1};
        algo.findMajority(arr);
        PerformanceTracker tracker = algo.getTracker();
        assertTrue(tracker.getComparisons() > 0);
        assertTrue(tracker.getAccesses() > 0);
    }
}
