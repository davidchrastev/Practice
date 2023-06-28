package LeetCode;

public class Queens {
    private int count;

    public int totalNQueens(int n) {
        count = 0;
        int[] queens = new int[n];
        solveNQueens(queens);
        return count;
    }

    private void solveNQueens(int[] queens) {
        int n = queens.length;
        int row = 0;
        queens[row] = -1;

        while (row >= 0) {
            queens[row]++;

            while (queens[row] < n && !isValid(queens, row)) {
                queens[row]++;
            }

            if (queens[row] < n) {
                if (row == n - 1) {
                    count++;
                } else {
                    row++;
                    queens[row] = -1;
                }
            } else {
                row--;
            }
        }
    }

    private boolean isValid(int[] queens, int row) {
        for (int i = 0; i < row; i++) {
            int diff = Math.abs(queens[i] - queens[row]);
            if (diff == 0 || diff == row - i)
                return false;
        }
        return true;
    }
}

