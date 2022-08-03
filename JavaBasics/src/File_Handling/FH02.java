package File_Handling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FH02 {
	
	void write() throws IOException {
		FileWriter fw=new FileWriter(".\\files\\file02.txt");
		fw.write("hello im kavya");
		fw.close();
	}
	void read() throws IOException {
		FileReader fr =new FileReader(".\\files\\file02.txt");
		System.out.println(fr.getEncoding());
		int i=0;    
        while((i=fr.read())!=-1){    
         System.out.print((char)i); 
	}}

	public static void main(String[] args) throws IOException {
		FH02 obj=new FH02();
		obj.write();
		obj.read();



	}

}
