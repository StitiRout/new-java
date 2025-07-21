package learnInit;
import java.util.Scanner;
public class simple5 {
 public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		 
		double radius, area, volume;
		System.out.println("Enter hemisphere radius : ");
		radius = sc.nextDouble();
		area = 3 * Math.PI * Math.pow(radius, 2); 
		System.out.println("your area of hemisphere: " + area);
		volume = 2.0/3 * Math.PI * Math.pow(radius, 3);
		System.out.println("volume of hemisphere: " + volume);

	}
}
    

