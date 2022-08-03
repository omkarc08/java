package File_Handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FH01 {
	
	void Fout() {
		 try {
	    	 FileOutputStream fs=new FileOutputStream(".\\files\\file01.txt");
	    	 fs.write(65);
	    	 fs.close();
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
	     finally {
	    	 System.out.println("we create 1st file");
	     }
	}
	void Fin() {
		try {
	    	 FileInputStream fs=new FileInputStream(".\\files\\file01.txt");
	    	 int i=fs.read();  
	            System.out.print((char)i);    
	    	 fs.close();
	     }
	     catch(Exception e) {
	    	 System.out.println(e);
	     }
//	     finally {
//	    	 System.out.println("we create 1st file");
//	     }
	}

	public static void main(String[] args) {
		FH01 f1=new FH01();
		f1.Fin();
	}

}
