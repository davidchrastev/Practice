import java.util.Arrays;

public class RandomProblem {
    public static void main(String[] args) {
        int[] nums = {9, 4, 6, 1, 9};

        String[] numStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numStrings[i] = Integer.toString(nums[i]);
        }

        Arrays.sort(numStrings, (a, b) -> {
            String s1 = a + b;
            String s2 = b + a;
            return s2.compareTo(s1);
        });


        StringBuilder sb = new StringBuilder();
        for (String s : numStrings) {
            sb.append(s);
        }
        String result = sb.toString();


        int largest = Integer.parseInt(result);

        System.out.println("The largest number is " + largest);
    }
}
