package org.Loops;

public class Numbers0To20 {
	int DisplayNum(int n) {
		for(; n<=20; n++) {
			System.out.println(n);
		}
		return n;
	}

	public static void main(String[] args) {
		Numbers0To20 n1 = new Numbers0To20();
		n1.DisplayNum(0);

	}

}
