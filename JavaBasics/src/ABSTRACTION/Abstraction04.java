package ABSTRACTION;

abstract class Shape {
	abstract void draw();
}

// In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
	void area(double w,double l) {
		double area = w*l;
		System.out.println("area of Rectangle is = "+area);
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
	void area(double r) {
		double pie=3.14;
		double area = pie*r*r;
		System.out.println("area of circle is = "+area);
	}
}
class Square extends Shape{
	void draw(){
		System.out.println("drawing square");
	}
	void area(double a) {
		double area = a*a;
		System.out.println("area of square is = "+area);
	}
}
public class Abstraction04 {

	public static void main(String[] args) {
		System.out.println("\n****************************");

		Rectangle r = new Rectangle();
		r.draw();
		r.area(12, 3.56);
		System.out.println("****************************");
		Circle1 c = new Circle1();
        c.draw();
        c.area(5);
		System.out.println("****************************");
        Square s = new Square();
        s.draw();
        s.area(4.79);
		System.out.println("****************************");

	}
}
