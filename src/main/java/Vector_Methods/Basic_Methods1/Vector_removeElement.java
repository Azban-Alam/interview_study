package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_removeElement {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// removeElement(Object element)
		v.removeElement("B");
		System.out.println("After removeElement('B'): " + v);

	}
}
