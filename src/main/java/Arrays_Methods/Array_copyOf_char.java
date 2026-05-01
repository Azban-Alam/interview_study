package Arrays_Methods;

import java.util.Arrays;

public class Array_copyOf_char {
   public static void main(String[] args) {

      char[] charArr = { 'A', 'B', 'C', 'D' };

      System.out.print("Char Array: [");
      for (int i = 0; i < charArr.length; i++) {
         System.out.print(charArr[i] + " ");
      }

      System.out.print("]\nCopied Array: \n");

      // Create copy of the array of same size
      char[] charArrCopy = Arrays.copyOf(charArr, charArr.length);
     
      System.out.print("Char Array: [");
      for (int i = 0; i < charArrCopy.length; i++) {
         System.out.print(charArrCopy[i] + " ");
      }
      System.out.print("]");
   }
}