package Arrays_Methods;

import java.util.Arrays;

public class Array_equals_boolean {
   public static void main(String[] args) {

      // initializing three boolean arrays
      boolean[] arr1 = new boolean[] { true, false, true };
      boolean[] arr2 = new boolean[] { false, true, true };
      boolean[] arr3 = new boolean[] { true, false, true };

      // comparing arr1 and arr2
      boolean retval = Arrays.equals(arr1, arr2);
      System.out.println("arr1 and arr2 equal: " + retval);

      // comparing arr1 and arr3
      boolean retval2 = Arrays.equals(arr1, arr3);
      System.out.println("arr1 and arr3 equal: " + retval2);
   }
}