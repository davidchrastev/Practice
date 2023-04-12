package LeetCode.Data_Structures_1;

import java.util.ArrayList;
import java.util.List;

public class Reshape {
    public static void main(String[] args) {
        System.out.println(matrixReshape(new int[][]{{1, 2}, {3, 4}}, 1, 4));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        List<Integer> resize = new ArrayList<>();
        int[][] newMatrix = new int[r][c];

        for (int row = 0; row < mat.length; row++) {
            for (int col = 0; col < mat[row].length; col++) {
                resize.add(mat[row][col]);
            }
        }
        int counter = 0;
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                newMatrix[row][col] = resize.get(counter);
                counter++;
            }
        }

        return newMatrix;
    }


}
