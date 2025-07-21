package learnInit;

import java.util.Scanner;

public class simple4 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int x,sum= 0;
		System.out.println("Enter three digit integer between 0 and 1000: ");
		x = sc.nextInt();
		int mod=0,div;
		mod= x %10;
		sum=sum +mod;
		div= x /10;
		x=div;
		mod=x%10;
		sum=sum +mod;
		div=x/10;
		x=div;
		mod=x%10;
		sum=sum +mod;
		div=x/10;
		x=div;
        System.out.println("Sum of digits " +  " is " + sum);

	}

}
