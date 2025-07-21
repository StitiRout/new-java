package learnInit;
class Cellphone{
	public void ring() {
		System.out.println(" ringing.....");
	}
	public void vibrate() {
		System.out.println(" vibrating.....");
	}
	public void call() {
		System.out.println(" calling friend....");
	}
}
public class simple24 {
    public static void main(String[] args) {
		
		Cellphone oneplus =new Cellphone() ;
		oneplus.ring();
		oneplus.call();
		oneplus.vibrate();	}
}
