package ABSTRACTION;

//interface i1{
//	//variable ---> by default ----> public static final
//	//method ---> by default ----> public abstract
//	//no constructor
//}
//Interface declaration: by first user  
interface Drawable {
	public abstract void draw();//by default---->public abstract
}
// Implementation: by second user
class Rectangle1 implements Drawable {
	//completting method of interface Drawable here and 
	//writing Public is must at the start of method
	public void draw() {
		System.out.println("drawing rectangle");
	}
}
class Circle implements Drawable {
	public void draw() {
		System.out.println("drawing circle");
	}
}

public class Interface01 {

	public static void main(String[] args) {
		Rectangle1 r = new Rectangle1();
		r.draw();
		System.out.println("**************************");
		Circle c = new Circle();
		c.draw();
		System.out.println("**************************");	
	}
}
