package CollectionInterface.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetC {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        System.out.println("\nSet");
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("b");
        System.out.println(set);

        HashSet<String> hset = new HashSet<>();
        System.out.println("\nHashSet");
        hset.add("a");
        hset.add("b");
        hset.add("c");
        hset.add("b");
        System.out.println(hset);
        System.out.println("\nhset.size() = " + hset.size());
        System.out.println("\nhset.contains() = " + hset.contains("c"));
        System.out.println("\n-----hashSet.remove()-----");
        hset.remove("a");
        System.out.println(hset);
        System.out.println("\nhset.isEmpty() = " + hset.isEmpty());
    }
}
