package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_subList {

	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 30));
		List<Integer> subList = l1.subList(2, 5);
		System.out.println(subList);
	}

}
