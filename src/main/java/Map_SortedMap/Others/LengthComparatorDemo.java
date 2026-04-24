package Map_SortedMap.Others;
import java.util.*;

public class LengthComparatorDemo {
    public static void main(String[] args) {
        // Custom comparator: sort by string length
        SortedMap<String, Integer> map = new TreeMap<>(Comparator.comparingInt(String::length));
        map.put("Apple", 1);
        map.put("Kiwi", 2);
        map.put("Banana", 3);

        // Purpose: Keys sorted by length
        System.out.println("Map: " + map);              // {Kiwi=2, Apple=1, Banana=3}
        System.out.println("First Key: " + map.firstKey()); // Kiwi
        System.out.println("Last Key: " + map.lastKey());   // Banana
    }
}
