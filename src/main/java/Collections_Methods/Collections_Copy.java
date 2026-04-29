package Collections_Methods;

import java.util.*;

public class Collections_Copy {
	public static void main(String[] args) {

		List<String> src = Arrays.asList("One", "Two", "Three");
		List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

		Collections.copy(src, dest); // Copies elements from src to dest (dest must be >= src size)
		System.out.println("Copied: " + src);

	}
}
