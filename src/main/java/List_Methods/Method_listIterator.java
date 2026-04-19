package List_Methods;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Method_listIterator {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(36);
		numbers.add(40);

		System.out.println("Original list: " + numbers);

		// Remove an element by value (not index!)
		numbers.remove(Integer.valueOf(36));

		System.out.println("After removing 36: " + numbers);

		// Using ListIterator to traverse and modify
		ListIterator<Integer> ltr = numbers.listIterator();

		while (ltr.hasNext()) {
			Integer num = ltr.next();
			System.out.println("Iterating: " + num);

			// Modify element conditionally
			if (num == 20) {
				ltr.set(25); // update 20 to 25
			}

			// Add new element after 30
			if (num == 30) {
				ltr.add(35); // insert 35 after 30
			}

			// Remove
			if (num == 36) {
				ltr.remove();
			}
			
		}

		System.out.println("Final list: " + numbers);
	}
}