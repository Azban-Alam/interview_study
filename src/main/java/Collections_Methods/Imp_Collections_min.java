package Collections_Methods;

import java.util.*;

public class Imp_Collections_min {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(10, 20, 5, 20, 20, 40);
		Integer min = Collections.min(nums);
		System.out.println("Min: " + min); // Finds minimum element

	}
}
