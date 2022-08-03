package COLLECTION;
import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
	ArrayList list2 = new ArrayList();
	list2.add("GRAPES");
	list2.add("WALNUTS");
	list2.add("pinuts");
	System.out.println(list2);
	
	ArrayList list1 = new ArrayList();
	list1.add("almonds");
	list1.add("butter");
	list1.addAll(list2);
	System.out.println(list1);

	}

}
