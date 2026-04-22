package Set_Interface.treeset.OtherCodes;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example2_string {

	public static void main(String[] args) {

		SortedSet<String> s1 = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
		s1.add("apple");
		s1.add("Mango");
		s1.add("Orange");
		s1.add("banana");

		System.out.println(s1); // Output: [apple, banana, Mango, Orange]

		/*
		 * String.CASE_INSENSITIVE_ORDER is a built-in comparator in Java that lets you
		 * sort strings without caring about uppercase vs lowercase.
		 * 
		 * How it works Normally:
		 * 
		 * "Mango" (capital M = 77) comes before "apple" (small a = 97). But with
		 * String.CASE_INSENSITIVE_ORDER, Java treats "Mango" and "apple" as if both
		 * start with the same letter, ignoring case.
		 */
	}

}
