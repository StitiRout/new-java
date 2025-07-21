package learnInit;

import java.util.Scanner;

public class simple11 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("enter the second number: ");
		int y = sc.nextInt();
		System.out.println("The GCD of " + x + " and " +y+ " is: ");
		while (x%y != 0)
		{
			int temp = x%y;
			x=y;
			y=temp;
		}
		System.out.print(y);

	}
}
