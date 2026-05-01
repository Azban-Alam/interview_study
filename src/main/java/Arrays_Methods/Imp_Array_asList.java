package Arrays_Methods;

import java.util.Arrays;
import java.util.List;

public class Imp_Array_asList {
	public static void main(String args[]) {

		// create an array of strings
		String a[] = new String[] { "abc", "klm", "xyz", "pqr" };

		List<String> list = Arrays.asList(a);

		// printing the list
		System.out.println("The list is:" + list);
	}
}