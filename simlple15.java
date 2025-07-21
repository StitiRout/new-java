package learnInit;

public class simlple15 {
    public static void main(String[] args) {
		
		final int numberperline = 10;
		final int totalnumber=100;
		for (int i=1;i<=totalnumber;i++)
		{
			System.out.printf("%-6d" , getPentagonalNumber(i));
			if (i%numberperline == 0)
			{
				System.out.println();
			}
		}
	}
public static int getPentagonalNumber(int n){
	return n * (3*n-1)/2;
}

}
