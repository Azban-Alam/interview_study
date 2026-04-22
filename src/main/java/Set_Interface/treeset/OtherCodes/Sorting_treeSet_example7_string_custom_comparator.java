package Set_Interface.treeset.OtherCodes;

import java.util.*;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		// Compare by length, then alphabetically if lengths are equal
		int lenCompare = Integer.compare(s1.length(), s2.length());
		if (lenCompare == 0) {
			return s1.compareTo(s2);
		}
		return lenCompare;
	}
}

public class Sorting_treeSet_example7_string_custom_comparator {
	public static void main(String[] args) {
		// Create TreeSet with custom comparator
		SortedSet<String> set = new TreeSet<>(new StringLengthComparator());
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		set.add("kiwi");
		set.add("pear");

		// Display all elements
		System.out.println("SortedSet: " + set);

	}
}
