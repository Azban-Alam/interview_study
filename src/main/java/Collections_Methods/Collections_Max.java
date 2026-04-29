package Collections_Methods;

import java.util.*;

public class Collections_Max {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 5, 20, 20, 40);
		Integer max = Collections.max(nums);
		System.out.println("Max: " + max); // Finds maximum element

	}
}
