package Logical_Programs;

public class Armstrong_number {
	
	
	static void armstrong(int num) {
		int con,rem,sum=0;
		con=num;
		while(num>0) {
			rem=num%10;
			sum=(rem*rem*rem)+sum;
			num=num/10;
		}
		if(sum==con) {
			System.out.println(con+" is Armstrong number");
		}else {
			System.out.println(con+" is not Armstrong number");
		}
	}

	public static void main(String[] args) {
		
		armstrong(123);
	}

}
