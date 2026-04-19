package Collection_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_add {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(500);

		System.out.println("Display Integer Objects In List  :"+list);

		List<String> list2 = new ArrayList<String>();
		list2.add("Apple");
		list2.add("Mango");
		list2.add("Orange");

		System.out.println("Display String Object In List  :"+list2);

	}

}
