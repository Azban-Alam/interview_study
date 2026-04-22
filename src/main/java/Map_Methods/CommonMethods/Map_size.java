package Map_Methods.CommonMethods;
import java.util.*;

public class Map_size {
    public static void main(String[] args) {
        // Create a HashMap (common Map implementation)
        Map<String, Integer> map = new HashMap<>();

        // 1. put(K key, V value) - Insert or update
        map.put("A", 100);
        map.put("B", 200);
        map.put("C", 300);
        System.out.println("Initial Map: " + map);

        // 6. size()
        System.out.println("Size of map: " + map.size());

        // 7. isEmpty()
        System.out.println("Is map empty? " + map.isEmpty());

        // 8. putAll(Map<? extends K, ? extends V> m)
        Map<String, Integer> anotherMap = new HashMap<>();
        anotherMap.put("X", 900);
        anotherMap.put("Y", 1000);
        map.putAll(anotherMap);
        System.out.println("After putAll: " + map);

        // 9. clear() - Remove all entries
        map.clear();
        System.out.println("After clear: " + map);
    }
}
