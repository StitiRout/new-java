package learnInit;

import java.util.Scanner;

public class simple8 {
    public static void main(String[] args) {
		int i,first,second,third,sum;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the first number: ");
		first=sc.nextInt();
		second=sc.nextInt();
		third=sc.nextInt();
		for(i=first;i<=second;i+=third);
		{
			sum=first+second+third;
		}
System.out.println("sum of number displayed" + sum);
	}

}
