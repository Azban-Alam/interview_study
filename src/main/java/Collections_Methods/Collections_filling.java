package Collections_Methods;

import java.util.*;

public class Collections_filling {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
		Collections.fill(list, "X"); // Replaces all elements with given value
		System.out.println("Filled: " + list); // Filled: [X, X, X, X]
		
	}
}
