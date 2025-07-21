package learnInit;

import java.util.Scanner;

public class simple10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        int count = 0;
        int sum = 0;

        System.out.print("Random numbers generated are: ");
        do {
            int randomNumber = (int) (Math.random() * N) + 1;
            System.out.print(randomNumber + " ");
            sum += randomNumber;
            count++;
        } while (count < N);

        double average = (double) sum / N;

        System.out.println("\nAverage of " + N + " random numbers is " + average);

        
    }
}
