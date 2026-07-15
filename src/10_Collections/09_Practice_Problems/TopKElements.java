import java.util.Collections;
import java.util.PriorityQueue;

public class TopKElements
{
	public static void main(String[] args)
	{
		int[] numbers = {10, 50, 30, 90, 20, 80, 70};

		int k = 3;

		PriorityQueue<Integer> maxHeap = new PriorityQueue<> (Collections.reverseOrder());

		for(int number : numbers)
		{
			maxHeap.add(number);
		}

		System.out.println("Top " + k + " Largest Elements: ");

		for(int i = 1; i<= k; i++)
		{
			System.out.println(maxHeap.poll());
		}
	}
}