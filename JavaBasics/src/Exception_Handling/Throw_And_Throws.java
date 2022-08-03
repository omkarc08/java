package Exception_Handling;

import java.io.IOException;

public class Throw_And_Throws {
	
	static void m1(int age) {
		if (age<18) {
			throw new ArithmeticException("You are not eligible to vote");
		}else {
			System.out.println("You are eligible to vote");
		}
	
	}
	void m2()throws IOException{
		throw new IOException("IOException is occured");
	}

   public static void main(String[] args) throws IOException{
		//Throw_And_Throws.m1(17);
		Throw_And_Throws obj = new Throw_And_Throws();
		//obj.m2();
		obj.m1(25);

	}

}
