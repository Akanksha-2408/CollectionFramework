package CollectionInterface.QueueInterface;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeC {
    public static void main(String[] args) {
        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.add("Abc");
        obj.add("Def");
        obj.add("Ghi");
        System.out.println("\n-----obj.descendingIterator()-----");
        Iterator<String> it = obj.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nobj.peekFirst() = " + obj.peekFirst());
        System.out.println("\nobj.peekLast() = " + obj.peekLast());
    }
}
