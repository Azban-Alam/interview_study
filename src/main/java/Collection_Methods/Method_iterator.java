package Collection_Methods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Method_iterator {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(500);

		Iterator itr = list.iterator();

		while (itr.hasNext()) {
			Integer next = (Integer) itr.next();
			System.out.println(next);
		}

	}

}
