package learnInit;

import java.util.Scanner;

public class simple14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number for which you want to find the multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("The multiplication table of " + number + " is:");

        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + "x" + i + "=" + result);
        }

    }
}
