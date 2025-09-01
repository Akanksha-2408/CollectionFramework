package MapInterface;

import java.util.LinkedHashMap;

public class LinkedHashMapC {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> obj = new LinkedHashMap<>();
        obj.put(1, "Car");
        obj.put(2, "Train");
        obj.put(3, "Bus");
        System.out.println(obj);
        System.out.println(obj.getOrDefault(4, "Train"));

//        System.out.println("\nobj.sequencedEntrySet() = " + obj.sequencedEntrySet());
//        System.out.println("\nobj.sequencedKeySet() = " +obj.sequencedKeySet());
//        System.out.println("\nobj.sequencedValues() = " +obj.sequencedValues());
//        obj.putFirst(0, "Cycle");
//        obj.putLast(5, "Plane");

        LinkedHashMap<Integer, String> obj1 = new LinkedHashMap<>();
        obj1.putAll(obj);
        System.out.println(obj1);
    }
}
