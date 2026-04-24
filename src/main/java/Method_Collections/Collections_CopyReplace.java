package Method_Collections;

import java.util.*;

public class Collections_CopyReplace {
	public static void main(String[] args) {
		List<String> src = Arrays.asList("One", "Two", "Three");
		List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));

		// Copies elements from src to dest (dest must be >= src size)
		Collections.copy(dest, src);
		System.out.println("Copied: " + dest);

		// Replaces all occurrences of oldVal with newVal
		Collections.replaceAll(dest, "Two", "Replaced");
		System.out.println("Replaced: " + dest);
	}
}
