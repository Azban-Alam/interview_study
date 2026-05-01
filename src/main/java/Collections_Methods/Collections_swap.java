package Collections_Methods;

import java.util.*;

public class Collections_swap {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));
		Collections.swap(list, 0, 2); // Swaps elements at given positions
		System.out.println("Swapped: " + list); // Swapped: [Banana, Apple, Mango]
	}
}
