package learnInit;
class monkey{
	void jump() {
		System.out.println(" jumping");
	}
	void bite() {
		System.out.println(" biting");
	}
}
interface  BasicAnimal{
	void eat();
	void sleep();
}
class  human extends monkey implements BasicAnimal {
	void speak() {
		System.out.println(" Speaking");
	}
public	void eat() {
		System.out.println("Eating");
	}
public	void sleep() {
		System.out.println(" Sleeping");
	}
	
}
public class simple22 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		human ass =new human();
		ass.sleep();
		monkey moo = new monkey();
		moo.jump();
//these are polymorphism
		BasicAnimal baa = new human(); 	//monkey use heiparibani        
		baa.eat();		//speak use karihbani
		monkey idiot =new human();
		idiot.jump(); 	//speak use karihabani
//use of speak only in
		human hum =new human();
		hum.speak();
	}
}
