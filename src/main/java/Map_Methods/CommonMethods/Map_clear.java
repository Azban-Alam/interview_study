package Map_Methods.CommonMethods;
import java.util.*;

public class Map_clear {
    public static void main(String[] args) {
        // Create a HashMap (common Map implementation)
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - Insert or update
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        System.out.println("Initial Map: " + map);

        // 9. clear() - Remove all entries
        map.clear();
        System.out.println("After clear: " + map);
    }
}
