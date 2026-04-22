package Map_Methods.Collection_View;
import java.util.*;

public class Map_keySet {
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Add some entries
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);

        // 1. keySet() - Returns all keys
        Set<String> keys = map.keySet();
        System.out.println("Keys: " + keys);

        // 2. values() - Returns all values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);

        // 3. entrySet() - Returns all key-value pairs
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        System.out.println("Entries: " + entries);

        // Iterating over entrySet
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
