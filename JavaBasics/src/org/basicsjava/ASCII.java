package org.basicsjava;

public class ASCII {
	char ch = 'a';
    char ascii() {
		int c = this.ch;
		System.out.println(c);
		return 'a';
	}

	public static void main(String[] args) {
		ASCII c1 = new ASCII();
		c1.ascii();

	}

}
