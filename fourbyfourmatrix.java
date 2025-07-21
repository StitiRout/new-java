package learnInit;

import java.util.Scanner;

public class fourbyfourmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] matrix = new double[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }
        double sum = sumMajorDiagonal(matrix);
        System.out.println("The sum of the major diagonal elements is: " + sum);
    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0.0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][i];
        }
        return sum;
    }
}
