package Collections_Methods;
import java.util.*;

public class Collections_Disjoint {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("A", "B", "C");
        List<String> list2 = Arrays.asList("X", "Y", "Z");
        
        boolean disjoint = Collections.disjoint(list1, list2);

        // Checks if two collections have no elements in common
        System.out.println("Disjoint? " + Collections.disjoint(list1, list2));
    }
}
