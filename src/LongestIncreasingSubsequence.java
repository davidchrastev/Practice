import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
    public static List<Integer> findLongestIncreasingSubsequence(int[] array) {
        int n = array.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] > array[j] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
        }

        int maxLength = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        List<Integer> result = new ArrayList<>();
        int currentLength = maxLength;

        for (int i = maxIndex; i >= 0; i--) {
            if (dp[i] == currentLength) {
                result.add(array[i]);
                currentLength--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        List<Integer> longestIncreasingSubsequence = findLongestIncreasingSubsequence(array);

        System.out.println("The longest increasing subsequence is: " + longestIncreasingSubsequence);

        scanner.close();
    }
}

