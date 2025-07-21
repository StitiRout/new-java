package learnInit;
import java.util.Scanner;
 class Person {
	String name;
	int age;
	public void setData() { 
		Scanner input =new Scanner (System.in);
		System.out.println("ENTER THE NAME OF THE PERSON : ");
		name =input.nextLine();
		System.out.println("ENTER THE AGE OF THE PERSON : ");
		age=input.nextInt();	
	}
	public void displayData( ){
		System.out.println("Name :  " + name + " and age : " + age );
		
	}
}
public class dsa1 {
    public static void main(String[] args) {
			// TODO Auto-generated method stub
			Person p1 =new Person() ;
			Person p2 =new Person();
			p1.name="Saukiv";
			p1.age =20;
			p2.setData();
			p1.displayData();
			p2.displayData();
			if ( p1.age<p2.age) {
				System.out.println(p1.name + " is younger" );
			}
			else 
			{
				System.out.println(p2.name + " is younger ");
			}

		}

}
