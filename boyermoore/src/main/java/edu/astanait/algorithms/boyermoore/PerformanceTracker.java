package edu.astanait.algorithms.boyermoore;

public class PerformanceTracker {
    private long comparisons;
    private long accesses;
    private long startTime;
    private long endTime;

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public void addComparison() {
        comparisons++;
    }

    public void addAccess() {
        accesses++;
    }

    public long getComparisons() {
        return comparisons;
    }

    public long getAccesses() {
        return accesses;
    }

    public long getElapsedTimeMillis() {
        return (endTime - startTime) / 1_000_000;
    }

    public void reset() {
        comparisons = 0;
        accesses = 0;
        startTime = 0;
        endTime = 0;
    }
}
