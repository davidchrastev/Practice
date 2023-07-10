import java.util.Arrays;

public class MaximumElementFinder {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 7, 3};

        int max = getMaxEl(array, array[0]);

        System.out.println("The maximum element in the array is: " + max);
    }

    private static int getMaxEl(int[] array, int max) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    private static int getMaxElWithStream(int[] array) {
        return Arrays.stream(array)
                .max()
                .orElseThrow(() -> new IllegalArgumentException("Array is empty."));
    }
}

