package CollectionInterface.SetInterface;

import java.util.LinkedHashSet;

public class LinkedHashSetC {
    public static void main(String[] args) {
        LinkedHashSet<String> obj = new LinkedHashSet<>();
        obj.add("a");
        obj.add("b");
        obj.add("c");
        System.out.println(obj);

        System.out.println("obj.isEmpty() = " + obj.isEmpty());
        System.out.println("obj.size() == " + obj.size());
        System.out.println("obj.containsAll() = " + obj.containsAll(new LinkedHashSet<>()));
    }
}
