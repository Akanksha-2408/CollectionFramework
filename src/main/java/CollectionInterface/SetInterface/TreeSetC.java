package CollectionInterface.SetInterface;

import java.util.*;

public class TreeSetC {
    public static void main(String[] args) {
        TreeSet<Integer> obj = new TreeSet<>();
        obj.add(23);
        obj.add(75);
        obj.add(46);
        System.out.println(obj);

        System.out.println("\n-----obj.descendingSet()-----");
        NavigableSet<Integer> nobj = obj.descendingSet();
        System.out.println(nobj);

        System.out.println("\n-----obj.comparator()-----");
        Comparator<? super Integer> comp = obj.comparator();
        System.out.println(comp);

        System.out.println("\n-----obj.descendingIterator()-----");
        Iterator<Integer> iter = obj.descendingIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("\nobj.ceiling(40) = " + obj.ceiling(40));
        System.out.println("\nobj.first() = " + obj.first());
        System.out.println("\nobj.floor(29) = " + obj.floor(29));

        System.out.println("\n-----obj.headSet()-----");
        SortedSet<Integer> nset = obj.headSet(50);
        System.out.println(nset);

        System.out.println("\n-----obj.tailSet()-----");
        SortedSet<Integer> tset = obj.tailSet(50);
        System.out.println(tset);

        System.out.println("\nobj.higher(23) = " + obj.higher(23));
        System.out.println("\nobj.subSet(10, 50) = " + obj.subSet(10, 50));
    }
}
