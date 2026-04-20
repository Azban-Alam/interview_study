package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_removeElementAt {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// removeElementAt(int index)
		v.removeElementAt(0);
		System.out.println("After removeElementAt(0): " + v);
	}
}
