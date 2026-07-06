import java.util.Stack;

public class StackOperations
{
	public static void main(String[] args)
	{
		Stack<Integer> stack = new Stack<>();

		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack: " + stack);

		System.out.println("Pop: " + stack.pop());

		System.out.println("Peek: " + stack.peek());

		System.out.println("Search 10: " + stack.search(10));

		System.out.println("Is Empty: " + stack.empty());

		System.out.println("Final Stack: " + stack);
	}
}