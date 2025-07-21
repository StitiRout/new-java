package learnInit;

import java.util.Scanner;

public class spyno {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inout=new Scanner (System.in);
		int n;
		System.out.println("Enter an integer : ");
		n=inout.nextInt();
		int sum=0;
		int product=1;
		while (n!=0)
		{
			 int digit=n%10;
			sum=sum+digit;
			product=product*digit;
			n=n/10;
		}
		if (sum==product)
		{
			System.out.println(  " is a spy ");
		}
		else 
		{
			System.out.println( "not a spy ");
		}

	}

    
}
