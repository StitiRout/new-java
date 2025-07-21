package learnInit;

import java.util.Scanner;

public class simple6 {
    public static void main(String[] args) {
		
		double sec;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of seconds : ");
		sec=input.nextDouble();
		double t,g,d;
		t=sec;
		g=32.174;
		d=1.0/2 *g*t*t;
		System.out.println("Distance travelled : " + d);
}
}