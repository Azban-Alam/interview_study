package Collections_Methods;

import java.util.*;

public class Collections_Replace {
	public static void main(String[] args) {

		List<String> dest = new ArrayList<>(Arrays.asList("X", "Y", "Z"));
		Collections.replaceAll(dest, "Two", "Replaced"); // Replaces all occurrences of oldVal with newVal
		System.out.println("Replaced: " + dest);
		
	}
}
