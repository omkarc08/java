package ABSTRACTION;
abstract class Demo1{
	abstract void print();
		void display() {
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo2{
	void display() {
		System.out.println("I am a non-abstract method display()..");
	}
	void display2() {
		System.out.println("I am a non-abstract method display()..");
	}
}
abstract class Demo3{
	abstract void print();
	abstract void print1();
	abstract void print2();
}
class Main1 extends Demo1{
	void print() {
		System.out.println("print method of main1 class");
	}
}
class Main2 extends Demo3{
	void print() {
		System.out.println("print method of main3 class");

	}
	void print1() {
		System.out.println("print1 method of main3 class");

	}
	void print2() {
		System.out.println("print2 method of main3 class");

	}
}

public class Abstraction02 {

	public static void main(String[] args) {
		Main1 m1 = new Main1();
		m1.display();
		System.out.println("*******************");
		Main2 m2 = new Main2();
		m2.print();
		m2.print1();
		m2.print2();
	}

}
