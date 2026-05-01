package List_Methods.Looping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Method_listIterator {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 36, 40));
		System.out.println("Original list: " + numbers);

		numbers.remove(Integer.valueOf(36)); // Remove an element by value (not index!)

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