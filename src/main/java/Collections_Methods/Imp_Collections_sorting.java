package Collections_Methods;

import java.util.*;

public class Imp_Collections_sorting {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));

		Collections.sort(list); // Sorts list in natural (ascending) order
		System.out.println("Sorted: " + list); // Sorted: [Apple, Banana, Mango]

		Collections.sort(list, Collections.reverseOrder()); // Sorts list using custom comparator (reverse order)
		System.out.println("Reverse Sorted: " + list); // Reverse Sorted: [Mango, Banana, Apple]
		
	}
}
