package Collection;
import java.util.Map;
import java.util.HashMap;

public class THashMap {
    public static void main(String[] args) {
        Map<Integer,String>h = new HashMap<Integer,String>();
        h.put(1, "A");
        System.out.println(h);
        h.put(1, "C");
        System.out.println(h);
        h.put(2, "D");
        System.out.println(h);
        h.remove(1);
        System.out.println(h);
        System.out.println(h.get(2));
        System.out.println(h.size());
    }
}
