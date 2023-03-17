package LeetCode.matrix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestValue {
    public static int deleteGreatestValue(int[][] grid) {
        List<List<Integer>> matrix = new ArrayList<>();

        for (int[] row : grid) {
            List<Integer> listRow = new ArrayList<>();
            for (int i : row) {
                listRow.add(i);
            }
            Collections.sort(listRow);
            matrix.add(listRow);
        }

        int sum = 0;
        while (matrix.size() > 0 && matrix.get(0).size() > 0) {

            int maxNumber = Integer.MIN_VALUE;
            for (List<Integer> row : matrix) {
                int max = Integer.MIN_VALUE;
                int maxIndex = -1;

                for (int i = 0; i < row.size(); i++) {
                    int value = row.get(i);

                    if (value > maxNumber) {
                        maxNumber = value;
                    }

                    if (value > max) {
                        max = value;
                        maxIndex = i;
                    }
                }

                row.remove(maxIndex);

            }
            sum += maxNumber;
        }

        return sum;

    }

    public static void main(String[] args) {
        int[][] grid = new int[][] {{1,2,4},{3,3,1}};
        System.out.println(deleteGreatestValue(grid));
    }

}
