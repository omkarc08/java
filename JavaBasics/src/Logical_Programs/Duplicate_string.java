package Logical_Programs;

public class Duplicate_string {

	public static void main(String[] args) {
		String str[]={"omkar","sachin","omkar","pratik"};
		for(int i=0;i<str.length-1;i++){
		  for(int j=i+1;j<str.length;j++){
		     if(str[i]==str[j]){
		        System.out.println(str[j]);
				}
			}
		}		
	
}}
