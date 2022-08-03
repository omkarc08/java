package STRINGS;

import java.util.Scanner;

public class String04 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str;
		System.out.println("Enter any sentence:");
		str=sc.next();
		sc.close();
		
		System.out.println(str.toUpperCase());//to convert string to Uppercase
		
		
		//to print one by one character of string
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		System.out.println("**************************************");
		//to print one by one character of string in reverse 
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println("**********Reverse string*************");
	    String temp="";
		for(int i=str.length()-1;i>=0;i--) {
     	temp=temp+str.charAt(i);
	}
		System.out.println(temp);


}
}
