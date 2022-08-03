package org.basicsjava;

public class Multiplication {
	float a = 20.10f;
	void mul() {
		float a=10.10f;
		System.out.println(a*this.a);
	}

	public static void main(String[] args) {
		Multiplication obj = new Multiplication();
		obj.mul();

	}

}
