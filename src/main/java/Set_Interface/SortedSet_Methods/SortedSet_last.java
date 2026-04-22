package Set_Interface.SortedSet_Methods;

import java.util.*;

public class SortedSet_last {
	public static void main(String[] args) {

		// TreeSet with natural ordering (alphabetical for Strings)
		SortedSet<String> set = new TreeSet<>();

		// Add elements
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		set.add("kiwi");
		set.add("pear");

		// Display all elements
		System.out.println("SortedSet: " + set); // [apple, banana, cherry, kiwi, pear]

		// last() - largest element
		System.out.println("Last element: " + set.last()); // banana

	}
}
