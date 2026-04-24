package Map_SortedMap.Others;
import java.util.*;

public class UserDefinedComparatorDemo {
    public static void main(String[] args) {
        // User-defined comparator: compare strings by their length
        SortedMap<String, Integer> map = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // Purpose: Compare based on length
                int result = Integer.compare(s1.length(), s2.length());
                
                // If lengths are equal, compare alphabetically to avoid duplicate keys
                if (result == 0) {
                    return s1.compareTo(s2);
                }
                return result;
            }
        });

        // Adding entries
        map.put("Apple", 1);
        map.put("Kiwi", 2);
        map.put("Banana", 3);
        map.put("Mango", 4);

        // Output
        System.out.println("Map sorted by length: " + map);
        System.out.println("First Key (shortest): " + map.firstKey());
        System.out.println("Last Key (longest): " + map.lastKey());
        System.out.println("HeadMap(<Banana): " + map.headMap("Banana"));
        System.out.println("TailMap(>=Banana): " + map.tailMap("Banana"));
        System.out.println("Comparator used: " + map.comparator());
    }
}
