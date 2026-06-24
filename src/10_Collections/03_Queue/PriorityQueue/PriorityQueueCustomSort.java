import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueCustomSort {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(50);
        pq.add(10);
        pq.add(30);
        pq.add(20);

        System.out.println("Priority Queue:");

        while(!pq.isEmpty()) {

            System.out.println(pq.poll());
        }
    }
}