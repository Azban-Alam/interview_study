package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_removeAllElements {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// 13. removeAllElements()
		v.removeAllElements();
		System.out.println("After removeAllElements: " + v);

	}
}
