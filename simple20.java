package learnInit;
class circle{
	public int radius;
	circle(){
		System.out.println("i am a circle");
	}
	circle(int r){
		System.out.println(" this is a circle");
		this.radius=r;
	}
	public double area(){
		return Math.PI*this.radius*this.radius;
	}
}
class cylinder extends circle{
	public int height;
	cylinder(){
		System.out.println("i ama a cylinder");
	}
	cylinder(int r,int h){
		super(r);
		System.out.println("this is a cylinder");
		this.height=h;
	}
	public double volume() {
		return Math.PI*this.radius*this.radius*this.height;
	}
}
public class simple20 {
    public static void main(String[] args) {
		cylinder result =new cylinder(34,67);
	circle output=new circle(78);
		


	}
}
