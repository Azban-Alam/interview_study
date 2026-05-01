package Arrays_Methods;

import java.util.Arrays;

public class Array_fill_char {
   public static void main(String[] args) {

      // initializing char array
      char arr[] = new char[] { 'A', 'D', 'B' };

      // let us print the values
      System.out.println("Actual values: ");
      for (char value : arr) {
         System.out.println("Value = " + value);
      }

      char replacement = 'Z';
      
      // using fill for placing value
      Arrays.fill(arr, replacement);

      // let us print the values
      System.out.println("New values after using fill() method: ");
      for (char value : arr) {
         System.out.println("Value = " + value);
      }
   }
}