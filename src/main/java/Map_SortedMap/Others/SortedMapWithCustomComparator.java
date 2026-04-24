package Map_SortedMap.Others;
import java.util.*;

import java.util.Comparator;

//User-defined comparator class
class LengthComparator implements Comparator<String> {
 @Override
 public int compare(String s1, String s2) {
     // Compare by length
     int result = Integer.compare(s1.length(), s2.length());

     // If lengths are equal, compare alphabetically
     if (result == 0) {
         return s1.compareTo(s2);
     }
     return result;
 }
}


public class SortedMapWithCustomComparator {
    public static void main(String[] args) {
        // Use our user-defined comparator class
        SortedMap<String, Integer> map = new TreeMap<>(new LengthComparator());

        // Add entries
        map.put("Apple", 1);
        map.put("Kiwi", 2);
        map.put("Banana", 3);
        map.put("Mango", 4);

        // Demonstrate methods
        System.out.println("Map sorted by length: " + map);
        System.out.println("First Key (shortest): " + map.firstKey());
        System.out.println("Last Key (longest): " + map.lastKey());
        System.out.println("HeadMap(<Banana): " + map.headMap("Banana"));
        System.out.println("TailMap(>=Banana): " + map.tailMap("Banana"));
        System.out.println("SubMap(Kiwi to Mango): " + map.subMap("Kiwi", "Mango"));
        System.out.println("Comparator used: " + map.comparator());
    }
}
