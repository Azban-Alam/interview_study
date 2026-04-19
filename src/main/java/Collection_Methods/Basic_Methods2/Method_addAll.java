package Collection_Methods.Basic_Methods2;

import java.util.ArrayList;
import java.util.List;

public class Method_addAll {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(40);
		list1.add(50);

		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(46);
		list2.add(67);
		list2.add(78);

		list1.addAll(list2);

		System.out.println(list1);
		
		// ----------------------------------------------------------
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Orange");
		
		List<String> l2 = new ArrayList<String>();
		l1.add("Banana");
		l1.add("Kiwi");
		l1.add("Pine Apple");
		
		l1.addAll(l2);
		
		System.out.println(l1);

		
	}

}
