package learnInit;

import java.util.Scanner;

public class tryingjava4 {
    public static void main(String[]args){
        Scanner sc  = new Scanner(System.in);
		System.out.println( "What is your gender (M or F):  ");
		char g =sc.next().charAt(0);
		System.out.println( "First name :  ");
		String name = sc.next();
		System.out.println( "Last name :  ");
		String title= sc.next();
		System.out.println( "Age:   ");
		int age = sc.nextInt();
		System.out.println( "Are u married, " + name +"(Y or N)?   " );
		char mrg =sc.next().charAt(0);
		if (g=='M')
				 {
			System.out.println(" Then i shall call you Mr. " +name );
				 }
		else if (g == 'F')
		{
			if (mrg == 'Y')	
			{
				System.out.println(" Then i shall call you Mrs. " +name );
			}
			else 
				System.out.println(" Then i shall call you Miss. " +name );
		}
		
		
    }
}
