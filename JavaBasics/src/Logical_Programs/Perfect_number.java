package Logical_Programs;

import java.util.Scanner;

public class Perfect_number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n,i=1,sum=0;
		System.out.println("enter number:");
		n=sc.nextInt();
		while(i<n) {
			if(n%i==0) {
				sum=sum+i;
			}
			i++;
		}
		if(n==sum) {
			System.out.println(i+" is perfect no");
			}else
			{
				System.out.println(i+"is not perfect number");
		}
	}

}
