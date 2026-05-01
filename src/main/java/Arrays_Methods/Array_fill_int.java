package Arrays_Methods;

import java.util.Arrays;

public class Array_fill_int {
   public static void main(String[] args) {

      // initializing int array
      int arr[] = new int[] { 10, 20, 15 };

      // let us print the values
      System.out.println("Actual values: ");
      for (int value : arr) {
         System.out.println("Value = " + value);
      }

      int replacement = 0;
      
      // using fill for placing value
      Arrays.fill(arr, replacement);

      // let us print the values
      System.out.println("New values after using fill() method: ");
      for (int value : arr) {
         System.out.println("Value = " + value);
      }
   }
}