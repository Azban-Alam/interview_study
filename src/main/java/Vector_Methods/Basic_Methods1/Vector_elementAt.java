package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_elementAt {
	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// elementAt(int index)
		System.out.println("Element at index 1: " + v.elementAt(1));

	}
}
