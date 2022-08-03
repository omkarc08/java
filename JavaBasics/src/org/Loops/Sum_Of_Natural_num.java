package org.Loops;

public class Sum_Of_Natural_num {
	void sum(int num) {
		int  sum=0;
		for(int i=1; i<=num; ++i) {
			//sum = sum+i--->0+2
			sum += i;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Sum_Of_Natural_num obj = new Sum_Of_Natural_num();
		obj.sum(10);

	}

}
