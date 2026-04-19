package Collection_Methods.Basic_Methods1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Method_toArray {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(500);
		
		Integer[] o = list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(o));
		
				
	}

}
