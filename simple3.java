package learnInit;
import java.util.Scanner;
public class simple3{
 public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		double bsalary ,DA ,HRA ,GrossSalary;
		System.out.println("Enter basic salary: ");
		bsalary = sc.nextDouble();
		DA = (40.0/100)*bsalary;
		HRA = bsalary*(20.0/100);
		GrossSalary = bsalary+DA+HRA;
		System.out.println( " DA is: "+ DA);
		System.out.println( " HRA is: "+ HRA);
		System.out.println("Gross salary is: "+ GrossSalary);

	}
 
}
