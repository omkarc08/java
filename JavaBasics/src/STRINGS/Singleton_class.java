package STRINGS;

public class Singleton_class {
	//instance of class created
	private static Singleton_class obj =new Singleton_class();
	
	//constructor declared as private
	private Singleton_class() {
		System.out.println("sigleton constructor is running...........");
	}
	
	//method returns intance of current class
	public static Singleton_class s1() {
		System.out.println("this is method og singleton class.......");
		return obj;
	}

	public static void main(String[] args) {
		
		
	}

}
