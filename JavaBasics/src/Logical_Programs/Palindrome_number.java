package Logical_Programs;

public class Palindrome_number {
	
	static void palindrome(int num) {
		int con,rem,sum=0;
		con=num;
		while(num>0) {
			rem=num%10;
			num=num/10;
			sum=(sum*10)+rem;
		}
		if(sum==con) {
			System.out.println(con+" is palindrome number");
		}else {
			System.out.println(con+" is not palindrome number");

		}
	}

	public static void main(String[] args) {
		palindrome(121);
	}

}
