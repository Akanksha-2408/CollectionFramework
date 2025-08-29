package CollectionInterface.ListInterface;

import java.util.*;

public class ListI {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dbc");
        list.add("Aef");
        list.add("Lhi");
        System.out.println("\nlist size = " + list.size());

        System.out.println("\n-----subList()-----");
        List lst = list.subList(0, 2);
        System.out.println(lst);

        System.out.println("\n-----list.sort()-----");
        list.sort(Comparator.naturalOrder());  //see this
        System.out.println(list);

        System.out.println("\n-----list.toArray()-----");
        list.toArray(new String[0]);  //Converts list to String
        System.out.println(list);

        System.out.println("\nlist hashcode generated = " + list.hashCode());

        //Reverse List
//        System.out.println("-----list.reversed()-----");
//        List<String> revlist = list.reversed();  //see this
//        System.out.println("Reversed list = " + revlist);

        //list.iterator()
        Iterator<String> iterator = list.iterator();
        System.out.println("\n-----Using list.iterator()-----");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //list.listIterator()
        ListIterator<String> stringListIterator = list.listIterator(2);
        System.out.println("\n-----Using list.listIterator()-----");
        while (stringListIterator.hasPrevious()) {
            System.out.println(stringListIterator.previous());
        }

        List<String> list1 = new ArrayList<>();
        System.out.println("\n-----addAll() method-----");
        list1.addAll(list);

        System.out.println("\n-----list1.clone()-----");
        System.out.println(((ArrayList<String>) list1).clone());
//        clone - collection class method
//              - not present in list
//              - overidden in arrayList and linkedList
//              - protected method
//              - creates shallow copy of lists

        //Retain All
        System.out.println("\n-----retainAll() method-----");
        System.out.println(list.retainAll(list));  //keeps the elements which are common in both list and list2
        System.out.println("list = " + list);

        System.out.println("\n-----containsAll() method-----");
        System.out.println(list.containsAll(list)); //returns boolean
//        System.out.println("\n-----clear() method-----");
//        list.clear(); //Empties the list
//        System.out.println("list = " + list);

//        System.out.println("\n-----removeAll() method-----");
//        list2.removeAll(list);  //Removes one list elements from another
//        System.out.println("list2 = " + list2);

//        //Replace All
//        System.out.println("\n-----replaceAll() method-----");
//        list2.replaceAll(String::toUpperCase);
//        System.out.println("list2 = " + list2);

    }
}
