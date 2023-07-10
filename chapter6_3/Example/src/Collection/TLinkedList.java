package Collection;

import java.util.List;
import java.util.LinkedList;

public class TLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<String>();
        list.add("Hello");
        list.add("Hello");
        list.add(1, "World");
        System.out.print(list);
    }
}
