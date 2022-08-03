package Logical_Programs;

import java.util.HashMap;
import java.util.Map;

public class Chara_Count {

	public static void main(String[] args) {
		String str="I am an engineer";
		HashMap<Character,Integer> charCount=new HashMap<Character,Integer>();
		char[] strArray=str.toCharArray();
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c,charCount.get(c)+1);
			}else {
				charCount.put(c,1);
			}
		}
		for (Map.Entry entry : charCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}
