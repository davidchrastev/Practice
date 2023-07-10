package LeetCode.matrix;

import java.util.Arrays;

public class SortStudents {
    public int[][] sortTheStudents(int[][] score, int k) {
        Arrays.sort(score, (a, b) -> b[k] - a[k]);
        return score;
    }
}
