package learnInit;

public class simple33 {
    public static void main(String[] args) {
		
		int i,j;
		char ch;
		for (i=1;i<=5;i++)
		{
			for (j=65;j<(65+i);j++)
			{
				ch=(char)j;
				System.out.print(ch+ "  ");
			}
			System.out.println();
		}
	

	}
}
