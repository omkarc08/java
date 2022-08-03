package ARRAYS;

public class Arr01 {
	
	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println("by using normal for loop");
		for(int i=0; i<a.length;i++) {
		System.out.println(a[i]);	
		}
		System.out.println("by using each for loop");
		for(int j:a) {
			System.out.println(j);
		}
		System.out.println("by using index number");
		System.out.println(a[3]);
	}
}
