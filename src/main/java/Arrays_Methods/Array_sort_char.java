package Arrays_Methods;

import java.util.Arrays;

public class Array_sort_char {
   public static void main(String[] args) {
      // initialize unsorted array
      char arr[] = { 'K', 'L', 'D', 'E', 'A', 'C', 'G', 'H' };

      System.out.print("Original Array: [");
      // print the array
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println("]");
     
      // sort the array
      Arrays.sort(arr);

      System.out.print("Sorted Array: [");
      // print the array
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println("]");
   }
}