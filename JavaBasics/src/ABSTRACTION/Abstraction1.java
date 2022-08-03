package ABSTRACTION;

abstract class Car{
	Car(){
		System.out.println("Running constructor of Abstract Car class ");
	}
	abstract void mycar();//abstract method always written without body
	//normal method 
	int myfevcar() {
		System.out.println("My fev car is Farrari");
		return 10;
	}
	int myfevcar(int a) {
		System.out.println("My fev car is Farrari");
		return 10;
	}
}
class Sportcar extends Car{
	Sportcar(){
		System.out.println("Running constructor of  SportCar Subclass ");
	}
	//body of abstract method is given here
 void mycar() {
		System.out.println("my car's colour is Black");
		
	}
	//normal/concrete method overriding
	int myfevcar() {
		System.out.println("My fev car is Farrari with red colour");
		super.myfevcar();
		return 10;
	}
}
public class Abstraction1 {
	public static void main(String[] args) {
		Sportcar s = new Sportcar();//classname ref_var = new classname(
		s.mycar();
		s.myfevcar();
	}
}
