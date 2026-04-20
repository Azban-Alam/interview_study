package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_remove_Index {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(1,40);  // add with index
		
		System.out.println(l1);
		
		l1.remove(2);
	}

}
