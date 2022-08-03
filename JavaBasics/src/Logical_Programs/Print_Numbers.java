package Logical_Programs;

public class Print_Numbers {

	public static void main(String[] args) {
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
		//reverse
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
		//even
		for(int i=1;i<=10;i++) {
			i++;
			System.out.println(i);
		}
		//odd
		for(int i=0;i<=10;i++) {
			i++;
			System.out.println(i);
		}
		int sum,x=10,y=20;
		 sum = x - ~y - 1;
		 System.out.println(sum);
	}

}
