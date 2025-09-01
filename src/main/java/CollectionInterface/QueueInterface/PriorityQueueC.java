package CollectionInterface.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueC {
    public static void main(String[] args) {
        PriorityQueue<Integer> obj = new PriorityQueue<>();
        obj.add(23);
        obj.add(42);
        obj.add(3);
        System.out.println(obj);
        obj.removeIf(n -> n % 10 == 0);

        System.out.println(obj.offer(23));
        System.out.println(obj.poll());
        System.out.println(obj.peek());

    }
}
