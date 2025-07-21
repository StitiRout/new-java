package learnInit;
 
import java.util.Scanner;

public class simple45{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		int x,y;
		System.out.println("Enter the x coordinate : ");
		x=input.nextInt();
		System.out.println("Enter the y coordinate : ");
		y=input.nextInt();
		if (x==0 && y==0)
		{
			System.out.println("X and Y are on origin");
		}
		else if (x==0)
		{
			System.out.println("X and Y are on y axis");
		}
		else if (y==0)
			{
				System.out.println("X and Y are on x axis");
			}
		else if (x>0 && y>0)
		{
			System.out.println("X and Y are on 1st quadrant");
		}
		else if (x<0 && y<0)
		{
			System.out.println("X and Y are on 3rd quadrant");
		}
		else if (x<0 && y>0)
		{
			System.out.println("X and Y are on 2nd quadrant");
		}
		else if (x>0 && y<0)
		{
			System.out.println("X and Y are on 4th quadrant");
		}
		input.close();
	}
 
    
}
