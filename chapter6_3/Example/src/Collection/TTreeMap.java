package Collection;
import java.util.Map;
import java.util.TreeMap;

public class TTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> t = new TreeMap<Integer, String>();
        t.put(1, "A");
        System.out.println(t);
        t.put(1, "C");
        System.out.println(t);
        t.put(2, "D");
        System.out.println(t);
        t.remove(1);
        System.out.println(t);
        System.out.println(t.get(2));
        System.out.println(t.size());
    }
}
