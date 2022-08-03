package org.Loops;

public class Prime_numbers {
	/*the numbers which is divided by 1 and only itself is known as prime no.
	    num= 7
	 * 7 is not divided by 2,3,4,5,6
	 * it is divided only by 1 and 7
	 */
	int check_prime(int num) {
		int rem=0;             
		for(int i=2; i<=num-1; i++) {
			if(num%i==0) {
				rem = rem+1;
			}
		}
		if(rem==0) {
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not a prime number");
		}
		return num;
	}

	public static void main(String[] args) {
		Prime_numbers obj = new Prime_numbers();
		obj.check_prime(7);
		obj.check_prime(9);
		obj.check_prime(13);

	}

}
