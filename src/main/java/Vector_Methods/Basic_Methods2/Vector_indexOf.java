package Vector_Methods.Basic_Methods2;

import java.util.Vector;

public class Vector_indexOf {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// 9. indexOf(Object element, int start)
		System.out.println("Index of 'C' from 1: " + v.indexOf("C", 1));

		// 12. lastIndexOf(Object element, int start)
		v.addElement("A");
		System.out.println("Last index of 'A' before 3: " + v.lastIndexOf("A", 3));

	}
}
