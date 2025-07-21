package learnInit;
abstract class pen{
	abstract void write();
	abstract void refill();
}
class fountainPen extends pen {
	void write() {
		System.out.println("Writing....");
	}
	void refill(){
		System.out.println("Refilling...");
		}
	void changeNib() {
		System.out.println(" Changing.....");
	}
}
public class simple19 {
    public static void main(String[] args) {
		
		fountainPen p = new fountainPen();
		p.write();

}}
