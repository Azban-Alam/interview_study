package Arrays_Methods;

import java.util.Arrays;

public class Imp_Array_compare_int {
   public static void main(String[] args) {

      // initialize first int array
      int array1[] = { 5, 10, 3, 14, 23 };

      // initialize second int array
      int array2[] = { 5, 10, 3, 14, 23 };
            
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