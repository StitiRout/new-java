package learnInit;
class rect{
	public int length;
	public int breadth;
	rect(){
		System.out.println(" hey,i am  rectangle");
	}
	rect(int l,int b){
		System.out.println("hello rectangle");
		this.length=l;
		this.breadth=b;
	}
	public double area() {
		return this.length*this.breadth;
	}
}
class squa extends rect{
	public int side;
	squa(){
		System.out.println(" hey,i am square");
	}
	squa(int l,int b,int s){
		super(l,b);
		System.out.println("hello square");
	}
	public double perimeter() {
		return this.side*4*this.length*this.breadth;
	}
}
public class simple23 {
    public static void main(String[] args) {
		
		squa show = new squa(2,7,3);

	}
}
