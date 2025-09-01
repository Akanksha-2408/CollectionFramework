package CollectionsClass;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(62);
        list.add(53);
        list.add(49);
        list.add(96);

        // Sorting list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Reversing list
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);

        // Shuffling list
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);

        // Frequency of 53
        System.out.println("Frequency of 53: " + Collections.frequency(list, 53));

        // As LIFO Queue using Deque
        Deque<Integer> deque = new ArrayDeque<>(list);
        Queue<Integer> lifoQueue = Collections.asLifoQueue(deque);
        lifoQueue.add(100);
        System.out.println("As LIFO Queue (Stack behavior): " + lifoQueue);

        // Copy list to list1
        System.out.println("\nCopying list to list1:");
        List<Integer> list1 = new ArrayList<>(Collections.nCopies(list.size(), 0)); // initialize with dummy values
        Collections.copy(list1, list);
        System.out.println("list1 = " + list1);

        // Empty List
        List<String> emptyList = Collections.emptyList();
        System.out.println("Empty List: " + emptyList);

        // indexOfSubList
        int index = Collections.indexOfSubList(list, list1);
        System.out.println("Index of sublist (list1 in list): " + index);

        // lastIndexOfSubList
        int lastIndex = Collections.lastIndexOfSubList(list, list1);
        System.out.println("Last index of sublist (list1 in list): " + lastIndex);

        // Reverse Order Comparator
        Comparator<Integer> reverseComparator = Collections.reverseOrder();
        System.out.println("Reverse order comparator: " + reverseComparator);

        // Enumeration from list
        Enumeration<Integer> enumeration = Collections.enumeration(list);
        System.out.print("Enumeration values: ");
        while (enumeration.hasMoreElements()) {
            System.out.print(enumeration.nextElement() + " ");
        }
        System.out.println();

        // Max and Min
        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Fill the list with 53
        Collections.fill(list, 53);
        System.out.println("List after fill: " + list);

        // Binary Search (need to sort again after fill is changed)
        Collections.sort(list);
        int searchIndex = Collections.binarySearch(list, 53);
        System.out.println("Index of 53 using binarySearch: " + searchIndex);

        // Unmodifiable list
        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        System.out.println("Unmodifiable list: " + unmodifiable);
        // unmodifiable.add(10); // This will throw UnsupportedOperationException

        // nCopies
        List<Integer> copiedList = Collections.nCopies(list.size(), 53);
        System.out.println("nCopies list: " + copiedList);

        // Swap elements
        Collections.swap(list, 0, list.size() - 1);
        System.out.println("List after swap: " + list);
    }
}
