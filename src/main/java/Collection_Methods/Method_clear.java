package Collection_Methods;

import java.util.ArrayList;
import java.util.List;

public class Method_clear {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();	
		list.add(100);
		list.add(300);
		list.add(400);
		list.add(500);
		
		// Clear All Objects From List
		list.clear();
		
		System.out.println("Display Empty List"+list);
		
	}

}
