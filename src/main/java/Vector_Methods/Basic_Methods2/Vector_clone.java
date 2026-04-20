package Vector_Methods.Basic_Methods2;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_clone {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();

		// 1. addElement(Object element)
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		System.out.println("After addElement: " + v);

		// 3. clone()
		Vector<String> cloneV = (Vector<String>) v.clone();
		System.out.println("Cloned Vector: " + cloneV);

	}
}
