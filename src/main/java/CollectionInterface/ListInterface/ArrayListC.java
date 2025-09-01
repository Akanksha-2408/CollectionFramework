package CollectionInterface.ListInterface;

import java.util.ArrayList;

public class ArrayListC {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Bus");
        list.add("Car");

        System.out.println("\n-----list.ensureCapacity()-----");
        list.ensureCapacity(5);  //Ensures list capacity
        System.out.println("list size = " + list.size());

        System.out.println("\n-----list.forEach()-----");  //supported in both arrayList and linkedList
        list.forEach(System.out::println);

        System.out.println("\n-----list.trimToSize()-----");  //opposite to ensureCapacity()
        list.trimToSize();
        System.out.println("list size after trim = " + list.size());
    }
}
