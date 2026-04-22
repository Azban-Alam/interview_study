package Set_Interface.SortedSet_Comparator_Method;

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

public class SortedSetAllMethodsDemo {
	public static void main(String[] args) {
		// Create TreeSet with custom comparator
		SortedSet<String> set = new TreeSet<>(new StringLengthComparator());

		// Add elements
		set.add("banana");
		set.add("apple");
		set.add("cherry");
		set.add("kiwi");
		set.add("pear");

		// Display all elements
		System.out.println("SortedSet: " + set);

		// comparator()
		Comparator<? super String> comp = set.comparator();
		if (comp != null) {
			System.out.println("Custom comparator is being used.");
		} else {
			System.out.println("Natural ordering is being used.");
		}

	}
}
