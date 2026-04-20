package Vector_Methods.Basic_Methods2;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_inserElementAt {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		System.out.println("After addElement: " + v);

		// 10. insertElementAt(Object element, int index)
		v.insertElementAt("X", 1);
		System.out.println("After insertElementAt: " + v);

	}
}
