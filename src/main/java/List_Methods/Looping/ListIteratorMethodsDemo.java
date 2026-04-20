package List_Methods.Looping;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorMethodsDemo {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Amit");
		names.add("Sunil");
		names.add("Ravi");

		ListIterator<String> itr = names.listIterator();
		
		// Forward Traversal
		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println("Name: " + name + ", Next Index: " + itr.nextIndex());
			if (name.equals("Sunil")) {
				itr.set("Suresh"); // Modify element
				itr.add("Nikita"); // Add new element after Suresh
			}
		}

		// Backward Traversal
		while (itr.hasPrevious()) {
			String name = itr.previous();
			System.out.println("Name: " + name + ", Previous Index: " + itr.previousIndex());
			if (name.equals("Ravi")) {
				itr.remove(); // Remove Ravi
			}
		}

		System.out.println("\nFinal list: " + names);
	}
}