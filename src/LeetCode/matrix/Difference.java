package LeetCode.matrix;

public class Difference {
    public int[][] onesMinusZeros(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        int[][] diffMatrix = new int[row][col];

        int[] oneRow = new int[row];
        int[] oneCol = new int[col];
        int[] zeroRow = new int[row];
        int[] zeroCol = new int[col];

        for (int currentRow = 0; currentRow < row; currentRow++) {
            for (int currentCol = 0; currentCol < col; currentCol++) {
                if (grid[currentRow][currentCol] == 1) {
                    oneRow[currentRow]++;
                    oneCol[currentCol]++;
                } else {
                    zeroRow[currentRow]++;
                    zeroCol[currentCol]++;
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                diffMatrix[i][j] = oneRow[i] + oneCol[j] - zeroRow[i] - zeroCol[j];
            }
        }

        return diffMatrix;

    }

}
