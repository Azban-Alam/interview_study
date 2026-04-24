package Method_Collections;

import java.util.*;

public class Collections_ShufflingAndFilling {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		Collections.shuffle(list); // Randomly shuffles elements
		System.out.println("Shuffled: " + list); // Shuffled: [B, D, A, C]

		Collections.fill(list, "X"); // Replaces all elements with given value
		System.out.println("Filled: " + list); // Filled: [X, X, X, X]
	}
}

