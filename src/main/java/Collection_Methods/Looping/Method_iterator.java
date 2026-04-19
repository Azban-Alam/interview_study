package Collection_Methods.Looping;

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

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			Integer next = itr.next();
			System.out.println(next);
		}

	}

}
