package Arrays_Methods;

import java.util.Arrays;

public class Imp_Array_copyOf_int {
   public static void main(String[] args) {

      int[] intArr = { 10, 20, 30, 13 };

      System.out.print("Int Array: [");
      for (int i = 0; i < intArr.length; i++) {
         System.out.print(intArr[i] + " ");
      }

      System.out.print("]\nCopied Array: \n");

      // Create copy of the array of same size
      int[] intArrCopy = Arrays.copyOf(intArr, intArr.length);
     
      System.out.print("Int Array: [");
      for (int i = 0; i < intArrCopy.length; i++) {
         System.out.print(intArrCopy[i] + " ");
      }
      System.out.print("]");
   }
}