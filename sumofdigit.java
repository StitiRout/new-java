package learnInit;

import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int n ;
		System.out.println("enter a number :");
		n=input.nextInt();
		int sum =sumOfDigits(n);
		System.out.println("Sum of digitd until single digit: " + sum);
	}
	public static int sumOfDigits(int num) {
		while (num>9) {
			int sum =0;
			while (num>0) {
				sum+=num%10;
				num/=10;
			}
			num=sum;
			
			}
			return num;
            
		}
	

	}


