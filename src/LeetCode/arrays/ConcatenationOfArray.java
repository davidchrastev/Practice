package LeetCode.arrays;

public class ConcatenationOfArray {
    public static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int size = 0;
        int counter = 0;

        while (size < nums.length * 2) {
            if (counter - 1 == nums.length - 1) {
                counter = 0;
            }

            result[size] = nums[counter];

            counter++;
            size++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] result = getConcatenation(new int[]{1,2,2});

        System.out.println(result);
    }
}
