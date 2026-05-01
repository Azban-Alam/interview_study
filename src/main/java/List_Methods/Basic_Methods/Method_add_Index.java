package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_add_Index {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30));
		System.out.println(l1);
		l1.add(1, 40); // add with index
		System.out.println(l1);

	}

}
