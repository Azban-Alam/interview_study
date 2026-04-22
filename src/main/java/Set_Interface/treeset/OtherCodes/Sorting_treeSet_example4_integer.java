package Set_Interface.treeset.OtherCodes;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example4_integer {

	public static void main(String[] args) {

		SortedSet<Integer> s1 = new TreeSet<>(Comparator.reverseOrder());

		s1.add(10);
		s1.add(30);
		s1.add(20);
		s1.add(45);

		System.out.println(s1);

		/*
		 * Comparator.reverseOrder() is a ready‑made comparator in Java that flips the
		 * natural ordering.
		 * 
		 * How it works For Integer, natural order = ascending (10, 20, 30, 45).
		 * 
		 * With Comparator.reverseOrder(), the order becomes descending (45, 30, 20,
		 * 10).
		 */

	}

}
