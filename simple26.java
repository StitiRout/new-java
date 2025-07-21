package learnInit;
class Circle1{
	int radius;
	public int area() {
		return ((int) (Math.PI)*radius*radius);
	}
	public int perimeter() {
		return (2*(int)(Math.PI)*radius);
	}
}
public class simple26 {
    public static void main(String[] args) {
		
		Circle1 result =new Circle1();
		result.radius=9;
		result.area();
		result.perimeter();
		System.out.println(" The area and perimeter of the circle is : " + result.area() + " and " + result.perimeter());

	}
}
