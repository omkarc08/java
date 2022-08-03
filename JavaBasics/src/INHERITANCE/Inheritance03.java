package INHERITANCE;

class Vehicle{
	Vehicle(){
		System.out.println("I am a Vehicle");
	}
}
class FourWheeler extends Vehicle{
	FourWheeler(){
		System.out.println("I am a FourWheeler Vehicle");
	}
	void car() {
		System.out.println("**********Jaguar***********");
	}
}
class TwoWheeler extends Vehicle{
	TwoWheeler(){
		System.out.println("I am a TwoWheeler Vehicle");
	}
	void bike() {
		System.out.println("*******Royal Enfield*******");
	}
}

public class Inheritance03 {

	public static void main(String[] args) {
		FourWheeler v1 = new FourWheeler();
		v1.car();
		TwoWheeler v2 = new TwoWheeler();
		v2.bike();
	}

}
