package Collections_Methods;

import java.util.*;

public class Collections_Frequency {
	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(10, 20, 5, 20, 20, 40);
		int frequency = Collections.frequency(nums, 20);
		System.out.println("Frequency of 20: " + frequency);// Counts occurrences of an element
	}
}
