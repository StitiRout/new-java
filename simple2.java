package learnInit;

import java.util.Scanner;

public class simple2 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double km ,inch ,meters ,cm ,feet;
		System.out.println("Enter the distance in km= ");
		km = sc.nextDouble();
		meters = km * 1000;
		feet = km * 3280.8399;
		inch = km*39370.0787;
		cm=km*100000;
		System.out.println("165 km is " +  meters +"metres");
		System.out.println("165 km is " +  feet +"feet");
		System.out.println("165 km is " + inch +"inch");
		System.out.println("165 km is " +  cm +"cm");


	}

}
