package Map_SortedMap.Others;
import java.util.*;

public class ReverseOrderDemo {
    public static void main(String[] args) {
        // Purpose: Sort keys in descending order
        SortedMap<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println("Keys in reverse order: " + map);
        System.out.println("First Key (largest): " + map.firstKey()); // C
        System.out.println("Last Key (smallest): " + map.lastKey());  // A
    }
}
