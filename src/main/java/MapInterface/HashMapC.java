package MapInterface;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapC {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new ConcurrentHashMap<>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");

        System.out.print("\nmap1 = ");
        System.out.println(map1);

        System.out.println("\n-----map1.replace()-----");
        map1.replace(2, "abc");
        System.out.println(map1);

        System.out.println("\n-----map1.keySet()-----");
        for (int i : map1.keySet()) {
            System.out.println(i);
        }

        System.out.println("\n-----map1.replaceAll()-----");
        map1.replaceAll((k, v) -> "Welcome " + v);
        System.out.println(map1);

        System.out.println("\n-----map1.compute()-----");
        map1.compute(2, (key, val) -> "Hii " + val);
        System.out.println(map1);

        System.out.println("\n-----map1.computeIfAbsent()-----");
        System.out.println("Returned: " + map1.computeIfAbsent(4, k -> "Hii " + k));
        System.out.println(map1);

        System.out.println("\n-----map1.computeIfPresent()-----");
        System.out.println("Returned: " + map1.computeIfPresent(2, (k, v) -> "Start " + v));
        System.out.println(map1);

        Map<Integer, String> map2 = new ConcurrentHashMap<>();
        map2.putAll(map1);
        map2.put(1, "r");

        System.out.print("\nmap2 = ");
        System.out.println(map2);

        System.out.println("\n-----map2.getOrDefault(k, v)-----");
        System.out.println("Key 1: " + map2.getOrDefault(1, "String"));
        System.out.println("Key 4: " + map2.getOrDefault(4, "String"));

        System.out.println("\n-----map2.putIfAbsent(k, v)-----");
        map2.putIfAbsent(1, "Brain");  // Won't insert
        System.out.println(map2);

        System.out.println("\n-----map2.merge()-----");
        map2.merge(4, "Car", (oldVal, newVal) -> "Train" + newVal);  // 4 doesn't exist, so inserts "Car"
        System.out.println(map2);
    }
}
