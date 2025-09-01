package CollectionInterface.ListInterface;

import java.util.Arrays;
import java.util.Stack;
import java.util.Vector;

public class VectorC {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        String[] arr = new String[5];
        vector.add("Hii");
        vector.add("Bye");  //elements are added one after another
        vector.insertElementAt("Hello", 1);

        vector.iterator().forEachRemaining(System.out::println);
//        vector.listIterator().forEachRemaining(System.out::println);
//        vector.spliterator().forEachRemaining(System.out::println);

        //iterator - forward only | remove() | java 1.2
        //listIterator - forward and backward | add(), set(), remove() | java 1.2
        //splitIterator - forward only | readOnly() | java 8+ |Use- stream/parallelism

        vector.copyInto(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(vector.elementAt(1));
        System.out.println(vector.getClass());
    }
}
