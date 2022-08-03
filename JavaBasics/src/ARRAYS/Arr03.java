package ARRAYS;

public class Arr03 {

	public static void main(String[] args) {
		String []Fruits= {"apple","orange","lichie"};
		Fruits[2]="kiwi";
		System.out.println(Fruits.length);
		System.out.println(Fruits[1]);
		for(int i=0; i<Fruits.length; i++) 
		{
			System.out.println(Fruits[i]);
		}
		
		int a[]=new int[5];//declaration and instantiation 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(a[0]);  
		System.out.println(a[1]);  
		System.out.println(a[2]);  
		System.out.println(a[3]);  
		System.out.println(a[4]);

	}

}
