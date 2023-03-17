package LeetCode.matrix;

public class RichestCustomerWealth {

    public static int maximumWealth(int[][] accounts) {
        int maxRowSum = Integer.MIN_VALUE;

        for (int[] account : accounts) {
            int currentSum = 0;
            for (int i : account) {
                currentSum += i;
            }
            if (currentSum > maxRowSum) {
                maxRowSum = currentSum;
            }
        }

        return maxRowSum;
    }

    public static void main(String[] args) {

        int[][] matrix = new int[][]{{2,8,7}, {7,1,3}, {1,9,5}};

        System.out.println(maximumWealth(matrix));
    }
}
