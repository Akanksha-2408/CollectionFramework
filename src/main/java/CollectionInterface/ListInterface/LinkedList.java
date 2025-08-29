package CollectionInterface.ListInterface;

public class LinkedList {
    public static void main(String[] args) {
        java.util.LinkedList<String> list = new java.util.LinkedList<>();
        list.add("123");

        System.out.println("list2 = " + list);
        System.out.println("\n-----addFirst() method-----");  //Similary addLast()
        list.addFirst("Hii"); //Declared in List(I), Overriden in LinkedList(C) only, not overriden in ArrayList(C)
        System.out.println("list2 = " + list);
        System.out.println("\n-----list2.getFirst()-----");  //similarly list.getLast()
        System.out.println(list.getFirst());

        System.out.println("\nlist2.element() = " + list.element());  //returns 1st list element
        //Supported in LinkedList, ArrayDeque, PriorityQueue
        //Throws NoSuchElementException if list is empty
    }
}
