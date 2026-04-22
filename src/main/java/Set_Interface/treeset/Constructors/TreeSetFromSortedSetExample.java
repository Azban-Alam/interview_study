package Set_Interface.treeset.Constructors;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetFromSortedSetExample {
    public static void main(String[] args) {
        // Step 1: Create a TreeSet (which itself is a SortedSet)
        SortedSet<String> originalSet = new TreeSet<>();
        originalSet.add("Banana");
        originalSet.add("Apple");
        originalSet.add("Mango");

        System.out.println("Original SortedSet: " + originalSet);

        // Step 2: Create a new TreeSet using the constructor that accepts SortedSet
        TreeSet<String> newTreeSet = new TreeSet<>(originalSet);

        System.out.println("New TreeSet (copied from SortedSet): " + newTreeSet);
    }
}
