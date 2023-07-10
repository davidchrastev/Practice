import java.util.Scanner;

public class SecondLargestElementFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        int secondLargest = findSecondLargestElement(array);

        System.out.println("The second largest element is: " + secondLargest);

        scanner.close();
    }

    public static int findSecondLargestElement(int[] array) {
        if (array.length < 2) {
            throw new IllegalArgumentException("Array should have at least two elements.");
        }

        int largest = Math.max(array[0], array[1]);
        int secondLargest = Math.min(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            int currentElement = array[i];

            if (currentElement > largest) {
                secondLargest = largest;
                largest = currentElement;
            } else if (currentElement > secondLargest) {
                secondLargest = currentElement;
            }
        }

        return secondLargest;
    }
}