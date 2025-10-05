package edu.astanait.algorithms.boyermoore;

public class BoyerMooreMajority {
    private final PerformanceTracker tracker = new PerformanceTracker();

    public Integer findMajority(int[] arr) {
        tracker.reset();
        tracker.start();

        Integer candidate = null;
        int count = 0;

        for (int num : arr) {
            tracker.addAccess();
            if (count == 0) {
                candidate = num;
                count = 1;
            } else if (num == candidate) {
                tracker.addComparison();
                count++;
            } else {
                tracker.addComparison();
                count--;
            }
        }

        tracker.stop();
        return candidate;
    }

    public PerformanceTracker getTracker() {
        return tracker;
    }
}
