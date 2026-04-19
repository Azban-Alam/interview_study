package Collection_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_removeAll {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		list1.add(46);
		list1.add(67);
		list1.add(78);


		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(46);
		list2.add(67);
		list2.add(78);

		if (list1.removeAll(list2)) {
			System.out.println("List2 removed Contains All");
		} else {
			System.out.println("List1 does not contains All");
		}

		System.out.println(list1);

		// ----------------------------------------------------------

		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Orange");
		l1.add("Banana");
		l1.add("Kiwi");
		l1.add("Pine Apple");

		List<String> l2 = new ArrayList<String>();
		l1.add("Banana");
		l1.add("Kiwi");
		l1.add("Pine Apple");
		
		if (list1.removeAll(list2)) {
			System.out.println("L1 remove All");
		} else {
			System.out.println("L1 does not contains All");
		}

	}

}
