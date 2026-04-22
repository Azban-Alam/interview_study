package Set_Interface.treeset.OtherCodes;

import java.util.*;

class StringLengthComparator2 implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		// Compare by length, then alphabetically if lengths are equal
		int lenCompare = Integer.compare(s2.length(), s1.length());
		if (lenCompare == 0) {
			return s2.compareTo(s1);
		}
		return lenCompare;
	}
}

public class Sorting_treeSet_example7_string_custom_comparator2 {
	public static void main(String[] args) {
		// Create TreeSet with custom comparator
		SortedSet<String> set = new TreeSet<>(new StringLengthComparator2());
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		set.add("kiwi");
		set.add("pear");

		// Display all elements
		System.out.println("SortedSet: " + set);

	}
}
