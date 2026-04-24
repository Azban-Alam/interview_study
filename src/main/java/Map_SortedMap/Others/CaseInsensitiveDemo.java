package Map_SortedMap.Others;
import java.util.*;

public class CaseInsensitiveDemo {
    public static void main(String[] args) {
        // Purpose: Ignore case when sorting keys
        SortedMap<String, Integer> map = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        map.put("apple", 1);
        map.put("Banana", 2);
        map.put("APPLE", 3);

        System.out.println("Keys case-insensitive: " + map);
        System.out.println("First Key: " + map.firstKey()); // apple
        System.out.println("Last Key: " + map.lastKey());   // Banana
    }
}
