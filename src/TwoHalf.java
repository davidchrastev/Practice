public class TwoHalf {
    public static void main(String[] args) {
        // { 1, 3, 2, 7, 27, -1, 4, 6, 4 }
        // O(N2)
        System.out.println(indexOfHalf(new int[]{1, 3, 2, 7, 27, -1, 4, 6, 4}));
    }
    public static int indexOfHalf(int[] arr) {
        int counter = 1;

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < counter; i++) {
            leftSum += arr[i];
        }

        for (int i = counter + 1; i < arr.length ; i++) {
            rightSum += arr[i];
        }

        for (int delimiter = 1; delimiter < arr.length - 1; delimiter++) {

            if (leftSum == rightSum) {
                return delimiter;
            }

            leftSum += arr[delimiter];
            rightSum -= arr[delimiter + 1];

        }

        return -1;
    }
    
    
}
