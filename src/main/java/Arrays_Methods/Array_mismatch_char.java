package Arrays_Methods;

import java.util.Arrays;

public class Array_mismatch_char {
   public static void main(String[] args) {

      // initialize first char array
      char array1[] = { 'A', 'C', 'D', 'B', 'E' };

      // initialize second char array
      char array2[] = { 'A', 'C', 'D', 'B', 'E' };
            
      int result = Arrays.mismatch(array1, array2);
      
      if(result == -1) {
    	  System.out.println("No mismatch. Arrays are same.");
      } else {
    	  System.out.println("First mismatch is at index: " + result);
      }
   }
}