import java.util.Arrays;

public class Palindromes {

    public static void main(String[] args) {
        //[3, 1, 12, -5, 6, 0, 10],  7
        int[] arr = new int[]{3, 1, 12, -5, 6, 0, 10};
        int target = 7;
        System.out.println(Arrays.toString(sumOfTwo(arr, target)));

    }

    private static int[] sumOfTwo(int[] arr, int target) {
        int[] result = new int[2];

        for (int i = 0; i <= arr.length - 1; i++) {
            //O(n)
            for (int j = arr.length - 1; j >= 0; j--) {
            //O(n2)
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return result;
    }

}
