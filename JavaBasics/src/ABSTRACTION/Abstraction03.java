package ABSTRACTION;

abstract class Bike{
	abstract void run();
	void speed(int spd) {
		System.out.println("My bike speed is: "+spd);
	}
	void colour(String clr) {
		System.out.println("My bike colour is: "+clr);
	}
}
class Royal_Enfield extends Bike{
	void run() {
		System.out.println("My bike runs very smoothly");
	}
	void speed(int spd) {
		System.out.println("Even speed is more than: "+spd+"KMPH");
		System.out.println("**********************************");
		super.speed(60);
		super.colour("Black");
	}
//	void colour(String clr) {
//		System.out.println("My bike colour is: "+clr);
//	}
}
public class Abstraction03 {

	public static void main(String[] args) {
		Royal_Enfield R1 = new Royal_Enfield();
		R1.colour("Metal Gray");
		R1.run();
		R1.speed(90);
		
	}
}
