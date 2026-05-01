package Arrays_Methods;

import java.util.Arrays;

public class Array_equals_int {
   public static void main(String[] args) {

      // initializing three int arrays
      int[] arr1 = new int[] { 10, 15, 20 };
      int[] arr2 = new int[] { 12, 18, 20 };
      int[] arr3 = new int[] { 10, 15, 20 };

      // comparing arr1 and arr2
      boolean retval = Arrays.equals(arr1, arr2);
      System.out.println("arr1 and arr2 equal: " + retval);

      // comparing arr1 and arr3
      boolean retval2 = Arrays.equals(arr1, arr3);
      System.out.println("arr1 and arr3 equal: " + retval2);
   }
}