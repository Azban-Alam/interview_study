package Vector_Methods.Looping;

import java.util.Vector;
import java.util.Enumeration;

public class Vector_Enumeration {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("A");
		v.addElement("B");
		v.addElement("C");

		// 6. elements()
		Enumeration<String> e = v.elements();
		System.out.print("Elements via Enumeration: ");
		while (e.hasMoreElements()) {
			System.out.print(e.nextElement() + " ");
		}

	}
}
