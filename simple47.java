package learnInit;
import java.util.Scanner;

public class simple47 {
    public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		int comp,user;
		comp=(int)(Math.random()*3);
		System.out.println("Scissor(0),rock(1),paper(2)");
		user=input.nextInt();
		System.out.print("The computer is :");
		switch (comp)
		{
		case 0: System.out.print("Scissor");
		break;
		case 1 : System.out.print("rock");
		break;
		case 2: System.out.print("paper");
		break;
		}
		if (comp==user)
		{
			System.out.println("  \"too,it's a draw\"");
		}
		else
		{
			boolean got=(user==0&&comp==2)||(user==1&&comp==0)||(user==2&&comp==1);
			if (got)
				System.out.println("  you won");
			else 
				System.out.println("  you lose");
		}
	}
}
