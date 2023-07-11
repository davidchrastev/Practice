import java.util.Scanner;

public class MedianOfTwoArrays {
    public static double findMedian(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int[] mergedArray = new int[totalLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k] = nums1[i];
                i++;
            } else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        while (i < m) {
            mergedArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < n) {
            mergedArray[k] = nums2[j];
            j++;
            k++;
        }

        if (totalLength % 2 == 0) {
            int midIndex = totalLength / 2;
            double median = (mergedArray[midIndex - 1] + mergedArray[midIndex]) / 2.0;
            return median;
        } else {
            int midIndex = totalLength / 2;
            return mergedArray[midIndex];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in array 1: ");
        int m = scanner.nextInt();
        int[] nums1 = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements in array 2: ");
        int n = scanner.nextInt();
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            nums2[i] = scanner.nextInt();
        }

        double median = findMedian(nums1, nums2);

        System.out.println("The median of the two arrays is: " + median);

        scanner.close();
    }
}
