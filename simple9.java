package learnInit;
import java.util.Scanner;
public class simple9{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int sumOfDigits = 0;

        // Calculate sum of digits
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            number /= 10;
        }

        // Check if the sum of digits is divisible by 9
        if (sumOfDigits % 9 == 0) {
            System.out.println("The number " + originalNumber + " is divisible by 9.");
        } else {
            System.out.println("The number " + originalNumber + " is not divisible by 9.");
        }

        
    }

}