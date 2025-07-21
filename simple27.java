package learnInit;
class Tommyvecetti{
	public void hit() {
		System.out.println(" Hitting the enemy .....");
	}
	public void fire() {
		System.out.println(" Firring the enemy .....");
	}
	public void run() {
		System.out.println(" Running the enemy .....");
	}
}
public class simple27 {
    public static void main(String[] args) {
		
		Tommyvecetti player = new Tommyvecetti();
		player.hit();
		player.fire();
		player.run();

	}

}
