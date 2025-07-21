package learnInit;

import java.util.Scanner;

public class simple16 {
    public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("ENTER THE INTEGER : ");
		int n= input.nextInt();
		System.out.println(n + " " + (isPalindrome(n) ? "is" : "is not ") + "a palindrome number ");
	}
	public static int reverse (int number)
	{
		int rev=0;
		while (number > 0)
		{
			int r= number%10;
			rev= rev *10 +r ;
			number /=10;
		}
		return rev;
	}
	public static boolean isPalindrome(int number )
	{
		if (number == reverse(number))
		{
			return true;}
			else {
				return false;
			}
		}

	}

