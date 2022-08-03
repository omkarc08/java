package COLLECTION;

import java.util.ArrayList;

public class ArrayList04 {

	public static void main(String[] args) {
		ArrayList city= new ArrayList();

		city.add("mumbai");
		city.add("chennai");
		city.add("pune");
		city.add("nagpur");
		
		System.out.println(city);
		System.out.println(city.size());
		city.add(1, "delhi");
		city.add(445207);
		city.add(true);
		System.out.println(city);
		
		System.out.println(city.contains("mumbai"));
		System.out.println(city.get(3));
		System.out.println(city.getClass());
		System.out.println(city.hashCode());
		System.out.println(city.toString());
		city.remove(2);
		city.trimToSize();
		System.out.println(city);
		System.out.println(city.isEmpty());
		System.out.println(city.iterator());
		System.out.println(city);
		
		ArrayList list = new ArrayList();
		//Adding elements to ArrayList
		list.add("apple");
		list.add("banana");
		list.add("orange");
		list.add(2, "kiwi");
		
		//city.addAll(list);
		city.addAll(2, list);
		city.removeAll(list);
		city.retainAll(list);
		System.out.println(city);


	}

}
