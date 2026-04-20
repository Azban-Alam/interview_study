package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_subList {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		l1.add(60);
		l1.add(30);

		List<Integer> subList = l1.subList(2, 5);
		System.out.println(subList);
	}

}
