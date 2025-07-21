package learnInit;

import java.util.Scanner;

public class suminarray {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Rows of 2D-Array: ");
        int rows = scanner.nextInt();
        System.out.println("Enter number of Columns of 2D-Array: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        System.out.println("Enter elements of 2D-Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The elements of 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
                }
            System.out.println();
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The sum of elements of the 2D-Array is " + sum);

        scanner.close();
    }
}
