package Collections_Methods;

import java.util.*;

public class Collections_Searching {
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Mango"));

		Collections.sort(fruits); // Must sort before binarySearch
		System.out.println("Sorted list: " + fruits);

		int index = Collections.binarySearch(fruits, "Banana");
		System.out.println("Index of Banana: " + index);

		int notFound = Collections.binarySearch(fruits, "Orange");
		System.out.println("Index of Orange (not found): " + notFound);
	}
}
