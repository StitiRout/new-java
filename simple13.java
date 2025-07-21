package learnInit;

import java.util.Scanner;

public class simple13 {
    public static void main(String[] args) {
		
		Scanner sourav = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int base = sourav.nextInt();
		System.out.println("Enter the power: ");
		int power = sourav.nextInt();
		//System.out.println(base + "to the power" + power + "is" + Math.pow(base, power));
		long result = 1;
        for (int i = 0; i < power; i++) {
            result *= base;
        }
        System.out.println(base + " to the power " + power + " is: " + result);
	}

}
