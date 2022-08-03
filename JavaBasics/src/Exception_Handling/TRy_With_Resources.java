package Exception_Handling;

import java.io.FileInputStream;
import java.io.IOException;

public class TRy_With_Resources {
	private static void printFile() throws IOException {

	    try(FileInputStream input = new FileInputStream("sample.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}

	public static void main(String[] args) throws IOException {
		printFile() ;

	}

}
