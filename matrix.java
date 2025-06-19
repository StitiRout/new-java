package learnInit;
import java.util.Scanner;
public class matrix {
     public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a 3-by-4 matrix row by row:");
            double[][] matrix = new double[3][4];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    matrix[i][j] = scanner.nextDouble();
                }
            }        
            for (int j = 0; j < 4; j++) {
                double sum = sumColumn(matrix, j);
                System.out.println("Sum of column " + j + ": " + sum);
            }
        }
       public static double sumColumn(double[][] m, int columnIndex) {
            double sum = 0.0;
            for (int i = 0; i < m.length; i++) {
                sum += m[i][columnIndex];
            }
            return sum;
        }
    }
    
    

