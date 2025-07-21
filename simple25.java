package learnInit;
class rectangle {
	int length;
	int breadth;
	public int area() {
		return length * breadth; 
	}
	public int perimeter() {
		return 2*(length+breadth);
	}
}
public class simple25 {
    public static void main(String[] args) {
		
		rectangle result =new rectangle();
		result.length=43;
		result.breadth = 21;
		result.area();
		result.perimeter();
		System.out.println(" the area of the reactangle is  " +  result.area() + " and perimeter is  " + result.perimeter());

}
}