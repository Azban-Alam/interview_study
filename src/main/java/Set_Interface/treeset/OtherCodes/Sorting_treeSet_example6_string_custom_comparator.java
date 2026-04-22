package Set_Interface.treeset.OtherCodes;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example6_string_custom_comparator {

	public static void main(String[] args) {

		SortedSet<String> s1 = new TreeSet<String>(new NewComparator());
		s1.add("apple");
		s1.add("Mango");
		s1.add("Orange");
		s1.add("banana");

		System.out.println(s1);

	}

}

class NewComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
	}

}