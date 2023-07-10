import java.util.Arrays;
import java.util.Scanner;

public class RandomProblem_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pointsToThrow = Integer.parseInt(scanner.nextLine());

        int[] indexesOfSafeHouse = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        char[] arr = new char[pointsToThrow];

        Arrays.fill(arr, 'x');
        for (int i = 0; i < indexesOfSafeHouse.length; i++) {
            arr[indexesOfSafeHouse[i]] = 'S';
        }

        int maxDistance = 0;


        maxDistance = getMaxDistance(pointsToThrow, indexesOfSafeHouse, maxDistance);

        System.out.println(maxDistance);
        print(arr);



    }

    private static int getMaxDistance(int pointsToThrow, int[] indexesOfSafeHouse, int maxDistance) {
        int minDistance;
        for (int i = 0; i < pointsToThrow; i++) {
            minDistance = Integer.MAX_VALUE;
            for (int j = 0; j < indexesOfSafeHouse.length; j++) {
                if (indexesOfSafeHouse[j] == i) {
                    minDistance = 0;
                    break;
                }
                int distance = Math.abs(indexesOfSafeHouse[j] - i);
                if (distance < minDistance) {
                    minDistance = distance;
                }
            }
            if (minDistance > maxDistance) {
                maxDistance = minDistance;
            }
        }
        return maxDistance;
    }

    public static void print(char[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + "-");
        }
    }

}
