package CollectionInterface.ListInterface;

import java.util.LinkedList;

public class LinkedListC {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Pen");
        list.add("Car");
        System.out.println(list);

        System.out.println("\n-----list.addFirst()-----");
        list.addFirst("Eraser");
        System.out.println(list);

        System.out.println("\n-----list.addLast()-----");
        list.addLast("Laptop");
        System.out.println(list);

        System.out.println("\n-----list.clone()-----");
        System.out.println(list.clone());  //creates shallow copy of list

        System.out.println("\n-----list.replaceAll()-----");
        list.replaceAll(String::toUpperCase);
        System.out.println(list);

        System.out.println("\nlist.size() = " + list.size());

        System.out.println("\nlist.indexOf(CAR) = " + list.indexOf("CAR"));  //case-sensitive

        System.out.println("\nlist.LastIndexOf(CAR) = " + list.lastIndexOf("PEN"));  //returns index of last occurance of the element

        System.out.println("\n-----list.offer()-----");  //adds element at the end of queue
        list.offer("PEN");  //Adds element to the end of the list/queue
                               //returns true if element is added successfully
        System.out.println(list);

        System.out.println("\n-----list.offerLast()-----");  //adds element at the end of double ended queue
        list.offerLast("Compass");
        System.out.println(list);

        System.out.println("\n-----list.offerFirst()-----");  //adds element at the start/head of double ended queue
        list.offerFirst("Scale");
        System.out.println(list);

        System.out.println("\nlist.element() = " + list.element());  //works in queue and linkedlist

        System.out.println("\n-----list.peek()-----");  //returns 1st element
        System.out.println(list.peek());

        //peek - returns head/1st element or null
        //element - returns head/1st element or NoSuchElementException

        System.out.println("\n-----list.poll()-----");  //removes 1st element, null if absent
        list.poll();
        System.out.println(list);

        System.out.println("\n-----list.pop()-----");  //throws NoSuchElementException
        list.pop();
        System.out.println(list);

        System.out.println("\n-----list.push()-----");
        list.push("Tree");
        System.out.println(list);

        System.out.println("\n-----list.removeFirstOccurance()-----");
        list.removeFirstOccurrence("PEN");
        System.out.println(list);

        System.out.println("\n-----list.set()-----");
        list.set(2, "Bus");
        System.out.println(list);

        System.out.println("\n-----list.toArray()-----");
        list.toArray();
        System.out.println(list);

        System.out.println("\n-----list.removeIf()-----");
        list.removeIf(word -> word.equals("Bus"));
        System.out.println(list);

        System.out.println("\n-----list.removeAll()-----");
        list.removeAll(list);
        System.out.println(list);
    }
}
