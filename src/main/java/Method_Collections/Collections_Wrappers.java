package Method_Collections;
import java.util.*;

public class Collections_Wrappers {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("A", "B"));

        // Returns immutable view (modification not allowed)
        List<String> unmodifiable = Collections.unmodifiableList(list);
        // unmodifiable.add("C"); // Throws UnsupportedOperationException

        // Returns synchronized (thread-safe) view
        List<String> syncList = Collections.synchronizedList(list);
        System.out.println(syncList);

        // Returns type-safe view (runtime type check)
        Collection<String> checked = Collections.checkedCollection(list, String.class);
        // checked.add(123); // Compile error
    }
}
