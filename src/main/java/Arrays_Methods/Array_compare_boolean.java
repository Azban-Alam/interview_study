package Arrays_Methods;

import java.util.Arrays;

public class Array_compare_boolean {
	public static void main(String[] args) {

		// initialize first boolean array
		boolean array1[] = { false, false, true, true, false };

		// initialize second boolean array
		boolean array2[] = { false, false, true, true, false };

		int result = Arrays.compare(array1, array2);

		if (result > 0) {
			System.out.println("First array is greater than second array.");
		} else if (result == 0) {
			System.out.println("Arrays are same.");
		} else {
			System.out.println("First array is less than second array.");
		}
	}
}