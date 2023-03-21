package LeetCode.sorting;

public class MinimumSumOfFourDigits {

    public static int minimumSum(int num) {
        int[] digits = new int[4];
        int size = 3;
        while (num > 0) {
            digits[size--] = num % 10;
            num /= 10;
        }
        int minSum = Integer.MAX_VALUE;

        for (int first = 0; first < 4; first++) {
            for (int second = 3; 0 < second; second--) {
                for (int third = 0; third < 4; third++) {
                    for (int fourth = 3; 0 < fourth; fourth--) {
                        if (first == second - 3) {
                            second--;
                        }
                        if (third == fourth - 3) {
                            fourth--;
                        }
                        String firstDig = digits[first] + "" + digits[second];
                        int firstPair = Integer.parseInt(firstDig);
                        String secondDig = digits[third] + "" + digits[fourth];
                        int secondPair = Integer.parseInt(secondDig);

                        minSum = Math.min(minSum, firstPair + secondPair);
                    }
                }
            }
        }
        return minSum;
    }


    public static void main(String[] args) {
//        int num = 2932;
////        int[] digits = new int[4];
////        int size = 3;
////        while (num > 0) {
////            digits[size--] = num % 10;
////            num /= 10;
////        }
////        int minSum = Integer.MAX_VALUE;
////        for (int j = 0; j < 4; j++) {
////            for (int k = j + 1; k < 4; k++) {
////                int new1 = digits[j] * 10 + digits[k];
////                for (int l = 0; l < 4; l++) {
////                    if (l == j || l == k) {
////                        continue;
////                    }
////                    int new2 = digits[l] * 100 + (digits[6 - j - k - l] * 10 + digits[3 - j - k]);
////                    minSum = Math.min(minSum, new1 + new2);
////                }
////            }
////        }

        System.out.println(minimumSum(2932));
    }
}
