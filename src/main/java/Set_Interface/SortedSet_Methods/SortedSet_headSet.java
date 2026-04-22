package Set_Interface.SortedSet_Methods;

import java.util.*;

public class SortedSet_headSet {
	public static void main(String[] args) {

		// TreeSet with natural ordering (alphabetical for Strings)
		SortedSet<String> set = new TreeSet<>();

		// Add elements
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		set.add("kiwi");
		set.add("pear");

		// headSet(E) - elements less than given
		System.out.println(set); //[apple, banana, cherry, kiwi, pear]

		// headSet(E) - elements less than given
		System.out.println("HeadSet(<cherry>): " + set.headSet("cherry")); // [apple, banana]

	}
}
