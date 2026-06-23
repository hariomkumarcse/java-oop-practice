import java.util.PriorityQueue;

public class PriorityQueueBasic
{
	public static void main(String[] args)
	{
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		pq.add(50);
		pq.add(10);
		pq.add(30);
		pq.add(20);

		System.out.println("Priority Queue: " + pq);

		while(!pq.isEmpty())
		{
			System.out.println("Removed: " + pq.poll());
		}
	}
}