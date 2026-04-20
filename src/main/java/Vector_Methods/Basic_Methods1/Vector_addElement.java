package Vector_Methods.Basic_Methods1;

import java.util.Vector;

public class Vector_addElement {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");
		System.out.println("After addElement: " + v);

	}
}
