package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class Diagonals {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagonal = 0;
        for (int row = 0; row < arr.size(); row++) {
            primaryDiagonal += arr.get(row).get(row);
        }

        int secondayDiagonal = 0;
        for (int row = arr.size() - 1; row >= 0; row --) {
            for (int col = 0; col < arr.get(row).size(); col ++) {
                int rowSize = arr.get(row).size();
                int rowIndex = row;
                int colIndex = col;
                if (rowIndex + colIndex == rowSize - 1) {
                    secondayDiagonal += arr.get(row).get(col);
                }

            }
        }
        return Math.abs(primaryDiagonal - secondayDiagonal);
    }
}
