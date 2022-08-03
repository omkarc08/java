package org.Loops;

public class Whileloop {
	int evenodd(int n) {
	
		while(n%2==0) {
			
			System.out.println(n++);
			
		}
		return n;
	}

	public static void main(String[] args) {
		Whileloop obj = new Whileloop();
		obj.evenodd(20);

	}

}
