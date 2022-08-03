
package INHERITANCE;

//parent class
class A{
	int x=20;
	A(){
		System.out.println("class A contructor running......");
	}
	void addnum() {
		float a=50f;
		double b=60;
		System.out.println("a+b = "+(a+b));
	}
}

//child class 
class B extends A{
	int x=30;
	B(){
		super();//it is used to call parent class contructor
		System.out.println("class B contructor running......");
		System.out.println(super.x);
		System.out.println(x);
	}
	void divnum() {
		double a=100;
		double b=5;
		System.out.println("a/b = "+(a/b));
	}
}
public class Inheritance01 {

	public static void main(String[] args) {
		B b1 =new B();
		b1.addnum();//calling method from parent class A
		b1.divnum();//calling method from child class B
		
		A a1 =new A();
		a1.addnum();
	
	}

}
