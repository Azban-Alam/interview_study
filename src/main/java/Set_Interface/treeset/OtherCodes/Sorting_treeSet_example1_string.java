package Set_Interface.treeset.OtherCodes;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example1_string {

	public static void main(String[] args) {

		SortedSet<String> s1 = new TreeSet<String>();
		s1.add("apple");
		s1.add("Mango");
		s1.add("Orange");
		s1.add("banana");

		System.out.println(s1); // Output : [Mango, Orange, apple, banana]

		/*
		 * In Java, uppercase letters have lower Unicode values than lowercase letters.
		 * 
		 * 👉 For example:
		 * 
		 * 'A' → Unicode 65
		 * 
		 * 'Z' → Unicode 90
		 * 
		 * 'a' → Unicode 97
		 * 
		 * 'z' → Unicode 122
		 * 
		 * So when TreeSet (or any sorting based on natural ordering) compares strings,
		 * "Mango" (starting with M = 77) comes before "apple" (starting with a = 97).
		 * That’s why your output was [Mango, Orange, apple, banana].
		 */

	}

}
