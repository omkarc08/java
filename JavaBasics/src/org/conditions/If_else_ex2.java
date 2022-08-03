package org.conditions;

public class If_else_ex2 {

	public static void main(String[] args) {
		int year = 2024;
		if (((year % 4 ==0) && (year % 100!=0)) || (year % 400==0)) { 
				System.out.println(year+"LEAP YEAR");  
			}  
			else{  
				System.out.println(year+"COMMON YEAR");  
			}

	}

}
