package learnInit;

import java.util.Scanner;

public class simple1 {
    public static void main(String[] args) {
		
		double fahrenheit ,celsius ;
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter in fahrenheit : ");
		fahrenheit = sc.nextDouble();
		System.out.println("celsius = ");
		celsius = (fahrenheit -32) * (5.0/9);
		System.out.println(celsius);
		

	}
}
