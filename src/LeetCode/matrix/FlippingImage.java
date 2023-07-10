package LeetCode.matrix;

import java.util.Arrays;

public class FlippingImage {

    public static int[][] flipAndInvertImage(int[][] image) {
        return invertImage(flipImage(image));
    }

    public static int[][] flipImage(int[][] image) {
        int[] rowFlip = new int[image[0].length];
        int size = rowFlip.length - 1;


        for (int row = 0; row < image.length; row++) {
            int counter = 0;

            for (int col = size; col >= 0; col--) {
                rowFlip[counter] = image[row][col];
                counter++;
            }

            for (int i = 0; i < image[row].length; i++) {
                image[row][i] = rowFlip[i];
            }

        }

        return image;
    }
    public static int[][] invertImage(int[][] image) {

        for (int row = 0; row < image.length; row++) {
            for (int col = 0; col < image[row].length; col++) {
                if (image[row][col] == 1) {
                    image[row][col] = 0;
                } else {
                    image[row][col] = 1;
                }
            }
        }
        return image;
    }


    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,0},
                                    {1,0,1},
                                    {0,0,0}};

        printMatrix(flipAndInvertImage(image));
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
