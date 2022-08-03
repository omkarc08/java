package Logical_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occurance_of_character_count {
	public static String countCharacter(String str) {
		HashMap<Character,Integer>  charCount=new HashMap<Character,Integer>();
		char[] strArray=str.toCharArray();
		for(char c:strArray) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c)+1);
			} else {
                charCount.put(c, 1);
            }
		}for(Entry<Character, Integer> Entry:charCount.entrySet()){
		System.out.println(Entry.getKey()+" "+Entry.getValue());
	}
		return str;}
	public static void main(String[] args) {
		countCharacter("success");
		

}}
