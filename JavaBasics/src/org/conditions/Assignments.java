 package org.conditions;

public class Assignments {
	
	int EvenOdd() {
		int i = 15;
		if(i/2==0) {
		System.out.println("\n\t\t"+i+" is a even number");	
		}
		else {
			System.out.println("\n\t\t"+i+" is a odd number");
		}
		return i;
	}
	
	
	char Alphabet() {
		char c = 'A';
		if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u') {
			System.out.println("\n\t\t"+c+" ia a vowel");
		}else if(c=='A'|| c=='E'|| c=='I'|| c=='O'|| c=='U') {
				System.out.println("\n\t\t"+c+" ia a vowel");
			
		}else {
			System.out.println("\n\t\t"+c+" ia a consonant");
		}
		return c;
	}
	    
	int LargestNum() {
		int num1 = 100;
		int num2 = 2000;
		int num3 = 300;
		if(num1>num2 && num1>num3) {
			System.out.println("\n\t\t"+num1+" is greater than "+num2+" and "+num3);
		}else if(num2>num1 && num2>num3) {
			System.out.println("\n\t\t"+num2+" is greater than "+num1+" and "+num3);
		}else {
			System.out.println("\n\t\t"+num3+" is greater than "+num1+" and "+num2);
		}
		return 1;
	}
	
	int LeapYear() {
		int year;
		year = 2000;
		if((year % 4 == 0)&&(year % 100!=0)||(year % 400==0) ) {
			System.out.println("\n\t\t"+year+" is a Leap Year");
		}else {
			System.out.println("\n\t\t"+year+" is not Leap Year");
		}
		return year;
	}
	
	int CheckNegativeNum() {
		int a = -15;
		if(a>0) {
			System.out.println("\n\t\t"+a+" is positive number");
		}else {
			System.out.println("\n\t\t"+a+" is negative number");
		}
		return a;
	}

	public static void main(String[] args) {
		Assignments A1 =new Assignments();
		A1.EvenOdd();
		Assignments A2 =new Assignments();
		A2.Alphabet();
		Assignments A3 =new Assignments();
		A3.LargestNum();
		Assignments A4 =new Assignments();
		A4.LeapYear();
		Assignments A5 =new Assignments();
		A5.CheckNegativeNum();
	}
//	{
//		System.out.println("********************HERE IS OUTPUT*****************************");
//	}

}
