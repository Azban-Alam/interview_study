package Collection_Methods.Basic_Methods1;

import java.util.ArrayList;
import java.util.List;

public class Method_remove {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(16);
		list1.add(26);
		list1.add(36);
		list1.add(56);

		System.out.println(list1);

		// Remove Object // list1.remove(36); //Error

		list1.remove(Integer.valueOf(36));

		System.out.println(list1);

		List<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Mango");
		list2.add("Orange");
		list2.add("Banana");

		System.out.println(list2);

		list2.remove("Banana");

		System.out.println(list2);
	}

}
