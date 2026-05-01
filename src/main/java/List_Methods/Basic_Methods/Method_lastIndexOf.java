package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_lastIndexOf {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50, 60, 30));
		System.out.println(l1.lastIndexOf(30));

	}
}
