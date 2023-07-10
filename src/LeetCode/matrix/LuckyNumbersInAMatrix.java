package LeetCode.matrix;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersInAMatrix {

    public static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            int minInRow = Integer.MAX_VALUE;
            int indexOfCol = 0;
            boolean isLucky = true;
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] < minInRow) {
                    minInRow = matrix[row][col];
                    indexOfCol = col;
                }
            }
            for (int check = 0; check < matrix.length; check++) {
                if (matrix[check][indexOfCol] > minInRow) {
                    isLucky = false;
                    break;
                }
            }
            if (isLucky) {
                luckyNumbers.add(minInRow);
            }
        }
        return luckyNumbers;
    }

    public static void main(String[] args) {
        int[][] testOne = new int[][]{{3,7,8},
                                    {9,11,13},
                                    {15,16,17}};

        int[][] testTwo = new int[][] {{7,8},
                                        {1,2}};

        int[][] testThree = new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}};

        luckyNumbers(testOne).forEach(System.out::println);
        luckyNumbers(testTwo).forEach(System.out::println);
        luckyNumbers(testThree).forEach(System.out::println);
    }
}
