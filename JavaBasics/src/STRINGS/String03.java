package STRINGS;

import java.util.Scanner;

public class String03 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		String name;
		System.out.println("Enter your name :");
		name=scn.next();
		int age;
		System.out.println("Enter your name :");
		age=scn.nextInt();
		double weight;
		System.out.println("Enter your name :");
		weight=scn.nextDouble();
		scn.close();
		if(age>18) {
			if(weight>45) {
				System.out.println(name+" you are eligible for blood donation");
			}
			else {
				System.out.println(name+" you are not eligible for blood donation");
			}
		}
	}

}
