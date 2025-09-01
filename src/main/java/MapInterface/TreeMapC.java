package MapInterface;

import java.util.*;

public class TreeMapC {
    public static void main(String[] args) {
        TreeMap<Integer,String> obj = new TreeMap<>();
        obj.put(10,"a");
        obj.put(36,"b");
        obj.put(23,"c");

        System.out.println("\n-----obj.descendingMap()-----");
        NavigableMap<Integer, String> dmap = obj.descendingMap();  //prints map elements in descending order
        System.out.println(dmap);

        System.out.println("\n-----obj.descendingKeySet()-----");
        for(int i : obj.descendingKeySet()) {
            System.out.println(i);
        }

        System.out.println("\nobj.firstEntry(): " + obj.firstEntry());
        System.out.println("\nobj.LastEntry(): " + obj.lastEntry());

        System.out.println("\n-----obj.navigableKeySet()-----");
        NavigableSet<Integer> nkset = obj.navigableKeySet();
        System.out.println(nkset);

        System.out.println("\nobj.floorEntry(23) = " + obj.floorEntry(23));
        System.out.println("\nobj.floorKey(23) = " + obj.floorKey(35));
        System.out.println("\nobj.ceilingEntry(50) = "+ obj.ceilingEntry(50));
        System.out.println("\nobj.ceilingKey(7) = " + obj.ceilingKey(7));

        System.out.println("\n-----obj.computeIfAbsent()-----");
        System.out.println(obj.computeIfAbsent(5, k -> obj.getOrDefault(5, "Absent")));
        System.out.println("\n-----obj.computeIfPresent()-----");
        System.out.println(obj.computeIfPresent(7, (k, v) -> obj.getOrDefault(5, "Present")));

        System.out.println("\n-----obj.headMap()-----");
        SortedMap<Integer, String> smap = obj.headMap(5, true);
        System.out.println(smap);

        System.out.println("\n-----obj.tailMap()-----");
        SortedMap<Integer, String> tmap = obj.headMap(10, true);
        System.out.println(tmap);

        System.out.println("\nobj.firstKey() = " + obj.firstKey());
        System.out.println("\nobj.LastKey()" + obj.lastKey());

        System.out.println("\n-----obj.higherEntry()-----");
        Map.Entry<Integer, String> entry = obj.higherEntry(3);
        System.out.println(entry);

        System.out.println("\n-----obj.higherKey()-----");
        int entryk = obj.higherKey(10);
        System.out.println(entryk);

        System.out.println("\n-----obj.lowerEntry()-----");
        Map.Entry<Integer, String> entryl = obj.lowerEntry(23);
        System.out.println(entryl);

        System.out.println("\n-----obj.lowerKey()-----");
        int entrylk = obj.lowerKey(10);
        System.out.println(entrylk);

        System.out.println("\nobj.putIfAbsent() = " + obj.putIfAbsent(10, "its"));

        System.out.println();
        System.out.println(obj.subMap(1, 50));
    }
}
