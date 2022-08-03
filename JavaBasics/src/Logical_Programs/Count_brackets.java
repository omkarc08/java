package Logical_Programs;

public class Count_brackets {

	public static void main(String[] args) {
		String input = "((()))((";
		  char search = '(';             // Character to search is 'a'.
		  char open = ')'; 
		  int count=0;
		  for(int i=0; i<input.length(); i++)
		  {
		      if(input.charAt(i) == search) {
		      count++;
		  }}

		  System.out.println("The Character '"+search+"' appears "+count+" times.");
		  

		  }
	}


