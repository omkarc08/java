package Logical_Programs;

public class Duplicate_numbers {

	public static void main(String[] args) {
		int[] num= {1,2,5,5,4,2};
		for(int i=0;i<num.length;i++){
		  for(int j=i+1;j<num.length;j++){
		        if(num[i]==num[j]){
		          System.out.println(num[j]);
				}
			}
		}

	}

}
