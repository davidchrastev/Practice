package LeetCode.matrix;

public class TicTacToe {
    public String tictactoe(int[][] moves) {
        boolean Aturn = true;
        boolean Bturn = false;
        char[][] board = new char[3][3];



        for (int move = 0; move < moves.length; move++) {
            int row = moves[move][0];
            int col = moves[move][1];
            char current;

            if (Aturn) {
                board[row][col] = 'A';
                current = 'A';
                Aturn = false;
                Bturn = true;
            } else {
                board[row][col] = 'B';
                current = 'B';
                Bturn = false;
                Aturn = true;
            }

            if (hasWon(board, current)) {
                return String.valueOf(current);
            }
        }

        if (moves.length == 9) {
            return "Draw";
        } else {
            return "Pending";
        }
    }

    private static boolean hasWon(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }

        for (int j = 0; j < 3; j++) {
            if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
                return true;
            }
        }

        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }

        return false;
    }
}
