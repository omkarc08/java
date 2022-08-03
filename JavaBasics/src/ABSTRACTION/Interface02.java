package ABSTRACTION;

interface Bike1{
	void speed(int spd);
}
class Classic implements Bike1{
	public void speed(int spd) {
		System.out.println("speed of Classic bike is "+spd);
	}

}
class Sports implements Bike1{
	public void speed(int spd) {
		System.out.println("speed of Sport bike is "+spd);
	}

}
public class Interface02 {

	public static void main(String[] args) {
		Classic c = new Classic();
		c.speed(90);
		System.out.println("*********************");
		Sports s = new Sports();
		s.speed(150);
	}
}
