package learnInit;

import java.util.Scanner;

public class simple12 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i=1; i<num; i++)
        {
        	if (num%i==0)
        	{
        		int fac=num%i;
        	}
        }
        if(sum==num)
        {
            System.out.println(num + " is a perfect number.");
        } if(sum!=num)
            System.out.println(num + " is not a perfect number.");

	}
}
