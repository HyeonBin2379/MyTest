package Collection;
import java.util.TreeSet;

public class TTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer>set = new TreeSet<Integer>();
        set.add(89);
        set.add(32);
        set.add(71);
        System.out.println("50 �̸��� ��: " + set.headSet(50));
        System.out.println("50 �̻��� ��: " + set.tailSet(50));
    }
}
