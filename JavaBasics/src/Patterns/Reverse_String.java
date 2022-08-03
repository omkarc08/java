package Patterns;
 
import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		String str=new String("welcome");
		String temp="";
		for(int i=str.length()-1;i>=0;i--){
		temp=temp+str.charAt(i);
		}
		System.out.println(temp);
		}
}

	
