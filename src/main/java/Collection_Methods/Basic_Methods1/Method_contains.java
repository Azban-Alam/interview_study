package Collection_Methods.Basic_Methods1;

import java.util.ArrayList;
import java.util.List;

public class Method_contains {

	public static void main(String[] args) {

		List<String> l1 = new ArrayList<String>();
		l1.add("Apple");
		l1.add("Mango");
		l1.add("Banana");
		l1.add("Orange");

		System.out.println(l1);

		// Check If List Contains "Mango"
		if (l1.contains("Mango")) {
			System.out.println("Yes- List Contains Mango");
		}else {
			System.out.println("List Does Not Contain Mango");
		}
	}
}
