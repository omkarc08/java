package Logical_Programs;

public class Reverse_string {

	public static void main(String[] args) {
		String str="kavya nandewar";
		String temp="";
		for(int i=str.length()-1;i>=0;i--){
		    temp=temp+str.charAt(i);
		}System.out.println(temp);
		
		
	
		for(int i=1;i<10;i++){
		if(i%2==0){
		  System.out.println(i+"is even");}
		else{System.out.println(i+"is odd");
		}

	}

}}
