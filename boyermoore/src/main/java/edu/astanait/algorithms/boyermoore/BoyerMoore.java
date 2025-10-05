package edu.astanait.algorithms.boyermoore;

public class BoyerMoore {

    private final int[] right;
    private final String pattern;

    public BoyerMoore(String pattern) {
        this.pattern = pattern;
        int R = 256;
        right = new int[R];
        for (int c = 0; c < R; c++) right[c] = -1;
        for (int j = 0; j < pattern.length(); j++)
            right[pattern.charAt(j)] = j;
    }

    public int search(String text) {
        int m = pattern.length();
        int n = text.length();
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m - 1; j >= 0; j--) {
                if (pattern.charAt(j) != text.charAt(i + j)) {
                    skip = Math.max(1, j - right[text.charAt(i + j)]);
                    break;
                }
            }
            if (skip == 0) return i;
        }
        return -1;
    }
}
