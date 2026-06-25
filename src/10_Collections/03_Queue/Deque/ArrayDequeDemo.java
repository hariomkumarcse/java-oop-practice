import java.util.ArrayDeque;

public class ArrayDequeDemo
{
	public static void main(String[] args)
	{
		ArrayDeque<String> deque = new ArrayDeque<>();

		deque.add("Java");
		deque.add("Spring");
		deque.add("SQL");

		System.out.println("Deque: " + deque);
		System.out.println("First Element: " + deque.getFirst());
		System.out.println("Last Element: " + deque.getLast()); 
	}
}