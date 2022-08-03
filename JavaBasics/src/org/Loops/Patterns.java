package org.Loops;

public class Patterns {
	
	int pyramid() {
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return 1;
	}
	
	char pyramid1() {
		for(char i='a'; i<='f'; i++) {
			for(char j='a'; j<=i; j++) {
				System.out.print("\t"+j+" ");
			}
			System.out.println();
		}
		return 1;
	}
	
	int pyramid2() {
		for(int i=1; i<6; i++) {
			for(int j=1; j>i; j--) {
				System.out.print(" ");
				for( j=1; j<=i; j++) {
					System.out.print("* ");
				}
			}
			
			System.out.println();
		}
		return 1;
	}

	public static void main(String[] args) {
		Patterns p1 =new Patterns();
		p1.pyramid();
		Patterns p2 =new Patterns();
		p2.pyramid1();
		Patterns p3 =new Patterns();
		p3.pyramid2();

	}

}
