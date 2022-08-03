package Exception_Handling;

public class Try_And_Catch {
	
	void try_catch_arthimetic() {
		int a=50;
		int b=0;
		int divide=a/b;
	}
	void try_catch_Array() {
		int a[]=new int[5];
		a[5]=100;
	}

	public static void main(String[] args) {
		Try_And_Catch t1= new Try_And_Catch();
		
		try{
		
//			t1.try_catch_arthimetic();
			try {
				t1.try_catch_Array();
			}catch(ArrayIndexOutOfBoundsException ar) {
				System.out.println("We cannot use index 5 because of: "+ar);
			}
		
		}
		catch(ArithmeticException Ar) {
			System.out.println("any value divided by zero will give "+Ar);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Here we performed arthimetic exception");
		}

	}

}
