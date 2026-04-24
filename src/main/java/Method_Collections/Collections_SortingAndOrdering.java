package Method_Collections;

import java.util.*;

public class Collections_SortingAndOrdering {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));

		Collections.sort(list); // Sorts list in natural (ascending) order
		System.out.println("Sorted: " + list); // Sorted: [Apple, Banana, Mango]

		Collections.sort(list, Collections.reverseOrder()); // Sorts list using custom comparator (reverse order)
		System.out.println("Reverse Sorted: " + list); // Reverse Sorted: [Mango, Banana, Apple]

		Collections.reverse(list); // Reverses the order of elements
		System.out.println("Reversed: " + list); // Reversed: [Apple, Banana, Mango]

		Collections.rotate(list, 1); // Rotates elements by given distance (cyclic shift)
		System.out.println("Rotated: " + list); // Rotated: [Mango, Apple, Banana]

		Collections.swap(list, 0, 2); // Swaps elements at given positions
		System.out.println("Swapped: " + list); // Swapped: [Banana, Apple, Mango]
	}
}
