package LeetCode.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ValidMatrix {
    public static boolean checkValid(int[][] matrix) {
        boolean isValid = true;
        List<Integer> validIntegers = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int counter = i + 1;
            validIntegers.add(counter);
        }

        for (int col = 0; col < matrix[0].length; col++) {
            List<Integer> current = new ArrayList<>(validIntegers);
            for (int row = 0; row < matrix.length; row++) {
                if (current.contains(matrix[row][col])) {
                    int index = current.indexOf(matrix[row][col]);
                    current.remove(index);
                }
            }
            if (!current.isEmpty()) {
                return false;
            }
        }

        for (int row = 0; row < matrix.length; row++) {
            List<Integer> current = new ArrayList<>(validIntegers);
            for (int col = 0; col < matrix[row].length; col++) {
                if (current.contains(matrix[row][col])) {
                    int index = current.indexOf(matrix[row][col]);
                    current.remove(index);
                }
            }
            if (!current.isEmpty()) {
                return false;
            }
        }


        return isValid;
    }

    public static void main(String[] args) {
        System.out.println(checkValid(new int[][]{
                {1,2,3},
                {3,2,1},
                {2,3,1}}));

    }
}
