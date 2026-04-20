package Vector_Methods.Basic_Methods2;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_coptInto {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		System.out.println("After addElement: " + v);

		// 4. copyInto(Object[] array)
		String[] arr = new String[v.size()];
		v.copyInto(arr);
		for (String s : arr) {
			System.out.print(s + " ");
		}

	}
}
