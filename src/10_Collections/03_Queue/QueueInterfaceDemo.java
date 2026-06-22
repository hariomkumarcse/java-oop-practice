import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {

    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.add("Java");
        queue.add("Spring");
        queue.add("SQL");

        System.out.println("Queue: " + queue);

        System.out.println("Front Element: " + queue.peek());

        System.out.println("Removed Element: " + queue.poll());

        System.out.println("Queue After Removal: " + queue);
    }
}