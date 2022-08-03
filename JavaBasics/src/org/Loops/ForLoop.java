package org.Loops;

public class ForLoop {
	static void EvenNumbers() {
		for(int i=0; i<=20; i++) {
			System.out.println(i);
			i++;
		}
		System.out.println("\n*********************************");
	}
    
	static int OddNumbers(int j) {
		for( ; j<=20; j++) {
			System.out.println(j);
			j++;
		}
		System.out.println("\n*********************************");
		return j;
	}
	static int Table(int n) {
		for(; n<=70; n++) {
			System.out.println(n);
			n=n+6;
		}
		System.out.println("\n*********************************");
		return n;
	}
	
	static char Alphabates(char c) {
		for(; c<='z'; c++) {
			System.out.println(c);
			
		}
		System.out.println("\n*********************************");
		return c;
	}
	
	static int AllinOne() {
		for(int i=0; i<=5; i++) {
			for(int j=3 ; j>=1; j--) {
				for(int n=7; n<=70; n++) {
					System.out.println(i+" "+j+" "+n);
					n=n+6;
				}
			}
		}
		System.out.println("\n*********************************");
		return 1;
	}
	public static void main(String[] args) {
		ForLoop.EvenNumbers();
		ForLoop.OddNumbers(1);
		ForLoop.Table(7);
		ForLoop.Alphabates('a');
		ForLoop.AllinOne();



	}

}
