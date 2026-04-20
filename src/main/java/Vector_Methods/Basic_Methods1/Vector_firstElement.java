package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_firstElement {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// firstElement()
		System.out.println("First Element: " + v.firstElement());

	}
}
