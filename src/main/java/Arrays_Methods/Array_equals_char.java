package Arrays_Methods;

import java.util.Arrays;

public class Array_equals_char {
   public static void main(String[] args) {

      // initializing three char arrays
      char[] arr1 = new char[] { 'A', 'D' , 'F' };
      char[] arr2 = new char[] { 'B', 'E' , 'F' };
      char[] arr3 = new char[] { 'A', 'D' , 'F' };

      // comparing arr1 and arr2
      boolean retval = Arrays.equals(arr1, arr2);
      System.out.println("arr1 and arr2 equal: " + retval);

      // comparing arr1 and arr3
      boolean retval2 = Arrays.equals(arr1, arr3);
      System.out.println("arr1 and arr3 equal: " + retval2);
   }
}