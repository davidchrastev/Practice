package LeetCode.Data_Structures_1;

import java.util.ArrayList;
import java.util.List;

public class Reshape {
    public static void main(String[] args) {
        System.out.println(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
        int[][] matrix = matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4);
        print(matrix);
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int countRow = mat.length;
        int countCols = mat[0].length;
        if (countRow * countCols != r * c) {
            return mat;
        }
        int[][] newMatrix = new int[r][c];
        int rowCounter = 0;
        int colCounter = 0;

        for (int[] row : mat) {

            for (int num : row) {
                newMatrix[rowCounter][colCounter] = num;
                colCounter++;
                if (colCounter == c) {
                    colCounter = 0;
                    rowCounter++;
                }
            }
        }
        return newMatrix;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }


}
