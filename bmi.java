package learnInit;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		double H,W;
		System.out.println("Enter the height of the person : ");
		H=input.nextDouble();
		System.out.println("Enter the weight of the person : ");
		W=input.nextDouble();
		double BMI = W/(H*H);
		if (BMI < 18.5)
		{
			System.out.println("UNDERWEIGHT");
		}
		else if (BMI>18.5 && BMI<24.9)
		{
			System.out.println("NORMAL WEIGHT");
		}
		else if (BMI > 25.0 && BMI < 29.9)
		{
			System.out.println("OVERWEIGHT");
		}
		else 
		{
			System.out.println("OBESE");
		}
	}

}

