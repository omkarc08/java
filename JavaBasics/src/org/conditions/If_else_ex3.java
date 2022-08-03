package org.conditions;

public class If_else_ex3 {

	public static void main(String[] args) {
		int age = 15;
		int weight = 10;
		if (age>=18) {
			if (weight>=50) {
				System.out.println("You are elible to donate blood :)");	
			}else{
				System.out.println("You are not elible to donate blood :)");	
			}
		}else{  
			  System.out.println("Age must be greater than 18"); 
		}

	}

}
