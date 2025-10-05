package edu.astanait.algorithms.boyermoore;

import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000};
        Random random = new Random();

        for (int n : sizes) {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = random.nextInt(10);
            }

            BoyerMooreMajority algo = new BoyerMooreMajority();
            Integer result = algo.findMajority(arr);
            PerformanceTracker tracker = algo.getTracker();

            System.out.printf("n=%d | result=%s | time=%d ms | comparisons=%d | accesses=%d%n",
                    n,
                    result,
                    tracker.getElapsedTimeMillis(),
                    tracker.getComparisons(),
                    tracker.getAccesses());
        }
    }
}
