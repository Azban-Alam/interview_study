package Vector_Methods.Basic_Methods2;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_setSize {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// 17. setSize(int size)
		v.setSize(5);
		System.out.println("After setSize(5): " + v);

		// 18. size()
		System.out.println("Size: " + v.size());

		// 19. toString()
		System.out.println("Vector toString(): " + v.toString());
	}
}
