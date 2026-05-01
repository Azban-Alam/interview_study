package Collections_Methods;

import java.util.*;

public class Collections_reverse {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));
		Collections.reverse(list); // Reverses the order of elements
		System.out.println("Reversed: " + list); // Reversed: [Apple, Banana, Mango]

	}
}
