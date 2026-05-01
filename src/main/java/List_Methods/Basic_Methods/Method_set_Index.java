package List_Methods.Basic_Methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_set_Index {
	public static void main(String[] args) {

		List<Integer> l1 = new ArrayList<Integer>(Arrays.asList(10,20,30));	
		System.out.println(l1.set(1,57));
	}

}
