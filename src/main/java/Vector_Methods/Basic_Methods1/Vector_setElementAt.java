package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_setElementAt {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// setElementAt(Object element, int index)
		v.setElementAt("Y", 0);
		System.out.println("After setElementAt('Y',0): " + v);

	}
}
