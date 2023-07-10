package LeetCode.matrix;

public class Convert1Dto2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = m * n;

        if (size > original.length) {
            return new int[0][0];
        }

        if (size < original.length) {
            return new int[0][0];
        }


        int[][] matrix = new int[m][n];
        int counter = 0;

        for (int row = 0; row < m; row++) {
            for (int col = 0; col < n; col++) {
                matrix[row][col] = original[counter];
                counter++;
            }
        }

        return matrix;


    }
}
