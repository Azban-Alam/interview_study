package Set_Interface.SortedSet_Comparator_Method;

import java.util.*;

public class SortedSetAllMethodsDemo1 {
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

		// comparator()
		Comparator<? super String> comp = set.comparator();
		if (comp != null) {
			System.out.println("Custom comparator is being used.");
		} else {
			System.out.println("Natural Sorting Ordering is being used.");
		}
	}
}
