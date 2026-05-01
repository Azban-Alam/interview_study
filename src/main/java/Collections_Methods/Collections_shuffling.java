package Collections_Methods;

import java.util.*;

public class Collections_shuffling {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));

		Collections.shuffle(list); // Randomly shuffles elements
		System.out.println("Shuffled: " + list); // Shuffled: [B, D, A, C]

	}
}
