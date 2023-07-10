package Collection;
import java.util.Set;
import java.util.HashSet;

public class THashSet {
    public static void main(String[] args) {
        Set<Integer> h = new HashSet<Integer>();
        h.add(2);
        System.out.println(h);
        h.add(1);
        System.out.println(h);
        h.add(1);
        System.out.println(h);
        h.remove(1);
        System.out.println(h);
        System.out.println(h.size());
    }
}
