package LeetCode.matrix;

public class MaximumOnes {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] result = new int[2];
        int maxCount = 0;

        for (int row = 0; row < mat.length; row++) {
            int currentCount = 0;
            for (int col = 0; col < mat[row].length; col++) {
                if (mat[row][col] == 1) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                result[0] = row;
                result[1] = maxCount;
            }
            currentCount = 0;
        }
        return result;
    }
}
