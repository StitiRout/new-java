package learnInit;
import java.util.*;;
public class complex {
int x;
	public void input(int x)
	{
		this.x=x;
		if(x<0) 
			throw new NumberFormatException("You entered negative number ");
		else
			System.out.println("Your lucky Number: "+x);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("Enter your lucky number: ");
		n=sc.nextInt();
		complex ob=new complex();
		try 
		{	
			ob.input(n);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}}