package LeetCode.matrix;

public class MaxIncrease {

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int size = grid.length;

        int[] maxNumRow = new int[size];
        int[] maxNumCol = new int[size];

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                maxNumRow[row] = Math.max(maxNumRow[row], grid[row][col]);
                maxNumCol[col] = Math.max(maxNumCol[col], grid[row][col]);
            }
        }
        int sum = 0;

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                sum += Math.min(maxNumRow[row], maxNumCol[col]) - grid[row][col];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3,0,8,4}, {2,4,5,7}, {9,2,6,3}, {0,3,1,0}};

        System.out.println(maxIncreaseKeepingSkyline(matrix));
    }

}
