package Map_Methods;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // put(): Insert elements
        map.put(101, "QA");
        map.put(102, "Dev");
        map.put(103, "Ops");
        map.put(104, "PM");

        // putIfAbsent(): Insert only if key is not present
        map.putIfAbsent(105, "HR");

        // get(): Retrieve a value by key
        System.out.println("Value for 102: " + map.get(102));

        // containsKey(): Check if a key exists
        System.out.println("Contains key 103? " + map.containsKey(103));

        // containsValue(): Check if a value exists
        System.out.println("Contains value 'Dev'? " + map.containsValue("Dev"));

        // keySet(): Get all keys
        System.out.println("All keys: " + map.keySet());

        // values(): Get all values
        System.out.println("All values: " + map.values());

        // entrySet(): Get all key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // size(): Get number of key-value pairs
        System.out.println("Map size: " + map.size());

        // isEmpty(): Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // remove(key): Remove by key
        map.remove(104);

        // remove(key, value): Remove if key maps to value
        map.remove(105, "HR");

        // replace(key, newValue): Replace value at key
        map.replace(102, "DevOps");

        // replace(key, oldValue, newValue): Conditional replace
        map.replace(103, "Ops", "TechOps");

        // clear(): Remove all entries
        // map.clear(); // Uncomment to clear map

        // Final map state
        System.out.println("Final map: " + map);
    }
}