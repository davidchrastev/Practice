import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Palindromes {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 1, 12, -5, 6, 0, 10};
        int target = 7;
        System.out.println(Arrays.toString(sumOfTwoOptimization(arr, target)));

    }

    private static int[] sumOfTwo(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

    private static int[] sumOfTwoOptimization(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            map.put(target - arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                result[0] = i;
                result[1] = map.get(arr[i]);
                return result;
            }
        }

        return new int[2];

    }

}