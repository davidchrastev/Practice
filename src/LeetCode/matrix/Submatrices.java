package LeetCode.matrix;

public class Submatrices {

    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] prefixSum = new int[m+1][n+1];
        int count = 0;

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {

                prefixSum[i][j] = matrix[i-1][j-1] +
                        prefixSum[i-1][j] +
                        prefixSum[i][j-1] -
                        prefixSum[i-1][j-1];

            }
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = i; k <= m; k++) {
                    for (int l = j; l <= n; l++) {

                        int sum = prefixSum[k][l] -
                                prefixSum[i-1][l] -
                                prefixSum[k][j-1] +
                                prefixSum[i-1][j-1];

                        if (sum == target) {
                            count++;
                        }

                    }
                }
            }
        }

        return count;
    }

}
