package LeetCode.matrix;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
//        int mainDiagonal = 0;
//        int secondDiagonal = 0;
        int sum = 0;


//        for (int row = 0; row < mat.length; row++) {
//            for (int col = 0; col < mat.length; col++) {
//                if (col + row == mat[row].length - 1) {
//                    secondDiagonal += mat[row][col];
//                }
//                if (col == row) {
//                    mainDiagonal += mat[row][col];
//                }
//            }
//        }

        for(int i= 0; i < mat.length;i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }

//        sum += mainDiagonal;
//        sum += secondDiagonal;

        if (mat.length % 2 != 0) {
            int center = mat.length / 2;
            sum -= mat[center][center];
        }


        return sum;
    }


    public static void main(String[] args) {
        System.out.println(diagonalSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }


}
