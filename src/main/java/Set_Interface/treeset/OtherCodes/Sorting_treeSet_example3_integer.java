package Set_Interface.treeset.OtherCodes;

import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example3_integer {

	public static void main(String[] args) {

		SortedSet<Integer> s1 = new TreeSet<Integer>();
		s1.add(10);
		s1.add(30);
		s1.add(20);
		s1.add(45);

		System.out.println(s1); // Output : [10, 20, 30, 45]

	}

}
