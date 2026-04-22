package Set_Interface.treeset.OtherCodes;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Sorting_treeSet_example8_stringbuffer_custom_comparator {
    public static void main(String[] args) {
        SortedSet<StringBuffer> s1 = new TreeSet<>(new BufferComparator());
        s1.add(new StringBuffer("apple"));
        s1.add(new StringBuffer("Mango"));
        s1.add(new StringBuffer("Orange"));
        s1.add(new StringBuffer("banana"));

        System.out.println(s1);
    }
}

class BufferComparator implements Comparator<StringBuffer> {
    @Override
    public int compare(StringBuffer o1, StringBuffer o2) {
        // Convert to String and compare in reverse order
        return o2.toString().compareTo(o1.toString());
    }
}
