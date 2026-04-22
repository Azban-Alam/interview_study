package Set_Interface.treeset.OtherCodes;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example5_integer_custom_comparator {

	public static void main(String[] args) {

		SortedSet<Integer> s1 = new TreeSet<>(new myComparator());
		s1.add(10);
		s1.add(30);
		s1.add(20);
		s1.add(45);

		System.out.println(s1);

	}

}

class myComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		return o2.compareTo(o1);
	}

}