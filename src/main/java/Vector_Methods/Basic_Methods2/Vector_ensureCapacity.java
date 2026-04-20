package Vector_Methods.Basic_Methods2;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_ensureCapacity {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// 7. ensureCapacity(int size)
		v.ensureCapacity(20);
		System.out.println("Capacity after ensureCapacity(20): " + v.capacity());

	}
}
