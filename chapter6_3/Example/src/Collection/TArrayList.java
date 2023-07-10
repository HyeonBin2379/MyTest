package Collection;
import java.util.List;
import java.util.ArrayList;

public class TArrayList {
    public static void main(String[] args) {
        List<Integer>a = new ArrayList<Integer>();
        a.add(2);
        System.out.println(a);
        a.add(1);
        System.out.println(a);
        a.add(1);
        System.out.println(a);
        a.add(1, 3);
        System.out.println(a);
        a.remove(2);
        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.size());
    }
}
