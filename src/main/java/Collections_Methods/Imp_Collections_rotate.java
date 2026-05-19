package Collections_Methods;

import java.util.*;

public class Imp_Collections_rotate {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("Banana", "Apple", "Mango"));
		System.out.println(list);
		Collections.rotate(list, 2); // Rotates elements by given distance (cyclic shift)
		System.out.println("Rotated: " + list); // Rotated: [Mango, Apple, Banana]

	}
}
