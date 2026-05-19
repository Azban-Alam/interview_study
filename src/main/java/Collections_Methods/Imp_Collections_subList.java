package Collections_Methods;
import java.util.*;

public class Imp_Collections_subList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "B", "C");
        List<String> sub = Arrays.asList("B", "C");

        // Finds first occurrence of sublist
        System.out.println("First index: " + Collections.indexOfSubList(list, sub));

        // Finds last occurrence of sublist
        System.out.println("Last index: " + Collections.lastIndexOfSubList(list, sub));
    }
}
