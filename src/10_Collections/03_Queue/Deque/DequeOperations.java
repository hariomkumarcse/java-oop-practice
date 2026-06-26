import java.util.ArrayDeque;
import java.util.Deque;

public class DequeOperations
{
	public static void main(String[] args)
	{
		Deque<Integer> deque = new ArrayDeque<>();

		deque.addFirst(10);
		deque.addLast(20);
		deque.addFirst(5);
		deque.addLast(30);

		System.out.println("Deque: " + deque);

		System.out.println("Removed First : " + deque.removeFirst());

		System.out.println("Removed Last : " + deque.removeLast());

		System.out.println("Deque After Removal : " + deque);

	}
}