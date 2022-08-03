package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 {

	public static void main(String[] args) {
		
	    //creating object of ArrayList
		ArrayList list = new ArrayList();
		//Adding elements to ArrayList
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add(2, "kiwi");
		//printing index of banana
		System.out.println(list.indexOf("banana"));
		//accessing elements of ArrayList
		System.out.println(list);
		//size of ArrayList
		System.out.println(list.size());
		//adding dates at index 3
		list.set(3, "dates");
		System.out.println(list.lastIndexOf(list));
		//iterating ArrayList by using normal for loop
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		//iterating ArrayList by using for-each loop
		for(Object fruits : list) {
			System.out.println(fruits);
		}
		Iterator<String> itr = list.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());
	}


	}


