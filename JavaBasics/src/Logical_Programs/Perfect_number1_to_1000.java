package Logical_Programs;

public class Perfect_number1_to_1000 {

	public static void main(String[] args) {
		int n;
		for(n=1;n<1000;n++){
			int i=1,sum=0;
		   while(i<n){
		     if(n%i==0){
		       sum=sum+i;
		     }i++;
		     } 
		     if(n==sum){
		      System.out.println(i+"is perfect no");}
	}

}}
