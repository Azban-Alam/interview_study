package Arrays_Methods;

import java.util.Arrays;

public class Imp_Array_sort_int {
	public static void main(String[] args) {

		int arr[] = { 11, 54, 23, 32, 15, 24, 31, 12 }; // initialize unsorted array

		System.out.print("Original Array:"); // print the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		Arrays.sort(arr); // sort the array

		System.out.print("Sorted Array: ["); // print the array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}