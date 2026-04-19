package Collection_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_isEmpty {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(500);

		if (list.isEmpty()) {
			System.out.println("List is Empty");
		} else {
			System.out.println("List Is Not Empty");
		}
	}

}
