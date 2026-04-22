package Set_Interface.SortedSet_Methods;

import java.util.*;

public class SortedSet_first {
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

		// first() - smallest element
		System.out.println("First element: " + set.first()); // apple

	}
}
