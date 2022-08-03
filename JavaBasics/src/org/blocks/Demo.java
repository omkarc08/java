package org.blocks;

public class Demo	{
	
	static int age = 20;
	 double salary = 18000.00;
	  
	 static {
		 System.out.println("static block start here...");
	 }
	 
	 {
		 System.out.println("non-static block start here...");
	 }
	 static int add(int x,int y) {
		 int res;
		 res = x+y;
		 System.out.println("addition of a and b is: "+res);
		 return res;
	 }
	 
	  int div(int x,int y) {
		 int res;
		 res = x/y;
		 System.out.println("division of a and b is: "+res);
		 return res;
	 }
	
}

class ClassBody2 {
	 static int age = 25;
	 double weight = 63.400;
	  
	 static {
		 System.out.println("static block start here...");
	 }
	 
	 {
		 System.out.println("non-static block start here...");
	 }
	 static int mul(int a,int b) {
		 int res;
		 res = a*b;
		 System.out.println("multiplication of a and b is: "+res);
		 return res;
	 }
	 
	  int div(int a,int b) {
		 int res;
		 res = a/b;
		 System.out.println("Division of a abd b is: "+res);
		 return res;
	 }
	  
	  public static void main(String[] arg) {
		  Demo obj = new Demo();
		  Demo.add(110, 220);
		  Demo D = new Demo();
		  D.div(96, 4);
		  System.out.println("age is: "+Demo.age);
		  System.out.println("salary is: "+obj.salary);
		  System.out.println("*************************************");
		  
		  ClassBody2 A = new ClassBody2();
		  System.out.println("age is: "+age);
		  System.out.println("weight is: "+A.weight);
		  ClassBody2.mul(10,5);
		  ClassBody2 D2 = new ClassBody2();
		  D2.div(100, 5);
		  
	  }
}	  