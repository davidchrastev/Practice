package LeetCode.matrix;

import java.util.*;

public class EqualRowAndColumn {
    public int equalPairs(int[][] grid) {
        int countPairs = 0;

        for (int[] currentRow : grid) {
            for (int col = 0; col < currentRow.length; col++) {
                int[] currentCol = new int[grid.length];

                for (int i = 0; i < grid.length; i++) {
                    currentCol[i] = grid[i][col];
                }

                if (Arrays.equals(currentRow, currentCol)) {
                    countPairs++;
                }
            }
        }

        return countPairs;
    }
}
