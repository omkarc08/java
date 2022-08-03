package STRINGS;

public class String05 {

	public static void main(String[] args) {
		String s1="I am from India";
		System.out.println("Actual String: "+s1);
		String[] strAry=s1.split(" ");
		for(String s:strAry) {
			System.out.println(s);
		}
		System.out.println("***************************");
		String s2="I am omkar from India";
		System.out.println("Actual String: "+s2);
		String[] strAry2=s2.split(" ", 4);
		for(String s:strAry2) {
			System.out.println(s);
		}
		System.out.println(s2.indexOf('d'));
		System.out.println(s2.indexOf("omkar"));
		System.out.println(s2.lastIndexOf('I', 10));
	    System.out.println("***************************");
		String s3="I am from Pune";		
		String str[]=s3.split(" ");
		String temp="";
		for(String s:str) {
			System.out.println(s);
		}
	//	for(int i=str.length-1;i>=0;i--) {
	//		temp=temp+" "+str[i];
	//	}
	System.out.println(temp.trim());
	
	String str3="Pune"+1536;
	System.out.println(str3);
	String str4=str3.concat(null);//Null Pointer Exception
	System.out.println(str4);
		
	}

}
