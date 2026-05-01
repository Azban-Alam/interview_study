package Arrays_Methods;

import java.util.Arrays;

public class Array_compare_char {
   public static void main(String[] args) {

      // initialize first char array
      char array1[] = { 'a', 'b', 'd', 'f', 'p' };

      // initialize second char array
      char array2[] = { 'a', 'b', 'd', 'f', 'p' };
            
      int result = Arrays.compare(array1, array2);
      
      if(result > 0) {
    	  System.out.println("First array is greater than second array.");
      } else if (result == 0) {
    	  System.out.println("Arrays are same.");
      } else {
    	  System.out.println("First array is less than second array.");
      }
   }
}