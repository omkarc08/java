package org.Inheritance;

public class A1 {
	static int num1 = 100;
	int a = 10;
	float b = 20.20f;
	
	public static void main(String[] args) {
		System.out.println("All Static members from class A1,B1 and C1 are:");
		System.out.println(A1.num1);
		System.out.println(B1.num2);
		System.out.println(C1.num3);
		
		System.out.println("All Non-Static members from class A1 are:");
        A1 obj1 = new A1();
        System.out.println(obj1.a);
        System.out.println(obj1.b);
        
		System.out.println("All Non-Static members from class B1 are:");
        B1 obj2 = new B1();
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(obj2.c);
        System.out.println(obj2.d);
        
		System.out.println("All Non-Static members from class C1 are:");
        C1 obj3 = new C1();
        System.out.println(obj3.a);
        System.out.println(obj3.b);
        System.out.println(obj3.c);
        System.out.println(obj3.d);
        System.out.println(obj3.e);
        System.out.println(obj3.f);

	}

}
class B1 extends A1{
	static int num2 = 200;
	int c = 20;
	float d = 30.20f;
}

class C1 extends B1{
	static int num3 = 300;
	int e = 30;
	float f = 40.20f;
}