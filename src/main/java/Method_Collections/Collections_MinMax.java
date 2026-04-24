package Method_Collections;

import java.util.*;

public class Collections_MinMax {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(10, 20, 5,20,20, 40);

		System.out.println("Min: " + Collections.min(nums)); // Finds minimum element

		System.out.println("Max: " + Collections.max(nums)); // Finds maximum element

		// Counts occurrences of an element
		System.out.println("Frequency of 20: " + Collections.frequency(nums, 20));
	}
}
